package jogo;

import jplay.URL;

public class Inimigo extends Personagens {

	private double attack = 1;
	public Inimigo(int x, int y) {
		super(URL.sprite("villan2-removebg-preview.png"), 16);
		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
		this.velocidade = 0.1;
	}
	public void perseguir(double x, double y) {
		
		if(this.x > x && this.y <= y + 50 && this.y >= y - 50) {
				moveTo(x, y, velocidade);
				if(direcao != 1) {
					setSequence(0,4);
					direcao = 1;
				}
				movendo = true;
		}
		else if(this.x < x && this.y <= y + 50 && this.y >= y - 50) {
			moveTo(x, y, velocidade);
			if(direcao != 2) {
				setSequence(4,8);
				direcao = 2;
			}
			movendo = true;
	}
		else if(this.y > y) {
			moveTo(x, y, velocidade);
			if(direcao != 4) {
				setSequence(8,12);
				direcao = 4;
			}
			movendo = true;
	}
		else if(this.y < y) {
			moveTo(x, y, velocidade);
			if(direcao != 5) {
				setSequence(12,16);
				direcao = 5;
			}
			movendo = true;
	}
		if(movendo) {
			update();
			movendo = false;
		}
	}
	public void morrer() {
		if(this.energia <= 0) {
			this.velocidade = 0;
			this.attack = 0;
			this.direcao = 0;
			this.movendo = false;
			this.x = 100000;
		}
	}
	public void attack(Jogador jogador) {
		if(this.collided(jogador)) {
			Jogador.energia -= this.attack;
		}
		if(Jogador.energia <= 0) {
			System.exit(0);
		}
	}
}
