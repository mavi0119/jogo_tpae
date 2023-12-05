package jogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Vector;

import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public class Jogador extends Personagens{

		static double energia = 1000;
	
		private double velocidade = 1.0;
		protected int direcao = 3;
		private boolean movendo = false;
		
		ControleGolpe golpes = new ControleGolpe();
		public void atacar(Window janela, Scene cena, Keyboard teclado, Personagens vilao) {
			if(teclado.keyDown(KeyEvent.VK_A)) {
				golpes.AdicionaGolpe(x + 5,y + 11,direcao, cena);
			}
			golpes.run(vilao);
		}
		public Jogador(int x, int y) {
			super(URL.sprite("personagem.png"), 16);
			this.x = x;
			this.y = y;		
			this.setTotalDuration(2000);
	}
		public void mover(Window janela, Keyboard teclado) {
			
				if(teclado.keyDown(Keyboard.LEFT_KEY)) {
					if(this.x > 0) {
						this.x -= velocidade;
				}
				if(direcao != 4) {
					setSequence(12, 16);
					direcao = 4;
				} 
				movendo = true;
			}
				else if(teclado.keyDown(Keyboard.RIGHT_KEY)) {
					if(this.x < janela.getWidth() - 50) {
						this.x += velocidade;
				}
					if(direcao != 2) {
						setSequence(8, 12);
						direcao = 2;
					} 
					movendo = true;
					
				}
				else if(teclado.keyDown(Keyboard.DOWN_KEY)) {
					if(this.y < janela.getHeight() - 50) {
						this.y += velocidade;
				}
					if(direcao != 5) {
						setSequence(0, 4);
						direcao = 5;
					} 
					movendo = true;
				}	
				else if(teclado.keyDown(Keyboard.UP_KEY)) {
					if(this.y > 0) {
						this.y -= velocidade;
				}
					if(direcao != 1) {
						setSequence(4, 8);
						direcao = 1;
					}movendo = true;
			}	
		if(movendo){
			update();
			movendo = false;
			}
		}
		
		Font f = new Font("arial", Font.BOLD, 30);
		public void energia(Window janela) {
		janela.drawText("VIDA: " + Jogador.energia, 30, 30, Color.RED, f);	
		}
		
		
}
