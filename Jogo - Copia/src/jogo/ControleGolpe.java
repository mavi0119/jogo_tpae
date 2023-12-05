package jogo;

import java.util.LinkedList;

import jplay.Scene;
import jplay.Sound;
import jplay.URL;

public class ControleGolpe {

	
	LinkedList<Ataque> golpes = new LinkedList<>();
	
	public void AdicionaGolpe(double x, double y, int caminho, Scene cena) {
		Ataque ataque = new Ataque(x, y , caminho);
		golpes.addFirst(ataque);
		cena.addOverlay(ataque);
		//somAtaque();
	}
	public void run(Personagens vilao) {
		for(int i=0; i < golpes.size();i++) {
			Ataque ataque = golpes.removeFirst();
			ataque.acao();
		golpes.addLast(ataque);
		
		if(ataque.collided(vilao)) {
			ataque.x = 10_000;
			vilao.energia -= 200;
			}
		}
	}
	//private void somAtaque() {
		//new Sound(URL.audio("")).play();
		
	//}
}
