package jogo;


import javax.swing.SwingUtilities;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 {
		
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Keyboard teclado;
	private Inimigo inimigo[];
	
	public Cenario1(Window window) {
		
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn.txt"));
		jogador = new Jogador(640, 350);
		teclado = janela.getKeyboard();
		inimigo = new Inimigo[10];
		run();
	
	}
													
	public void run() {
		
		for(int i=0; i<inimigo.length;i++) {
			inimigo[i] = new Inimigo(80*i,80*i);
		}
		while(true) {
			cena.moveScene(jogador);
			jogador.mover(janela, teclado);
			jogador.caminho(cena);

			jogador.x += cena.getXOffset();
			jogador.y += cena.getYOffset();
			
			
			for(int i=0;i<inimigo.length;i++) {
			inimigo[i].caminho(cena);
			inimigo[i].perseguir(jogador.x, jogador.y);
			inimigo[i].x += cena.getXOffset();
			inimigo[i].y += cena.getYOffset();
			inimigo[i].draw();
			jogador.atacar(janela, cena, teclado, inimigo[i]);
			inimigo[i].morrer();
			inimigo[i].attack(jogador);
			}
			
			jogador.energia(janela);
			
			jogador.draw();
			janela.update();
			if(teclado.keyDown(Keyboard.ENTER_KEY)) {
				janela.dispose(); // fecha a janela do cenário 1
				SwingUtilities.invokeLater(() -> {
                    Cenario2.abrir();// abre jframe do cenário 2
                });
			}
	
		}
		
	}

	
	
}
