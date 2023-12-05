package jogo;

import jplay.Sprite;
import jplay.URL;

public class Ataque extends Sprite{

	
	public static final int LEFT = 1, RIGHT = 2, STOP = 3, UP = 4, DOWN = 5;
	
	protected static final int	VELOCIDADE_ATAQUE = 1;

	protected int caminho = STOP;
	protected boolean movendo = false;
	protected int direcao = 3;
	
	
	public Ataque(double x, double y, int caminho) {
		super(URL.sprite("tiro.png"), 7);
		this.caminho = caminho;
		this.x = x;
		this.y = y;
	}
	
	

	public void acao() {
		if(caminho == LEFT) {
			this.y -= VELOCIDADE_ATAQUE;
			if(direcao != 1) {
				setSequence(5,7);
			}
			movendo = true;
		}
	
		
		if(caminho == RIGHT) {
			this.x += VELOCIDADE_ATAQUE;
			if(direcao != 2) {
				setSequence(4,5);
			}
			movendo = true;
		}
	

		if(caminho == UP) {
			this.x -= VELOCIDADE_ATAQUE;
			if(direcao != 4) {
				setSequence(2,4);
			}
			movendo = true;
		}

		if(caminho == DOWN || caminho == STOP) {
			this.y += VELOCIDADE_ATAQUE;
			if(direcao != 5) {
				setSequence(0,2);
			}
			movendo = true;
		}
	
	}
}
