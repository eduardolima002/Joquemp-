package jokempô;

public class PlaySystem {

	public void imprimeEscolha(int x) {
		switch (x) {
		case 1:
			System.out.println(" : Pedra");
			break;

		case 2:
			System.out.println(" : Papel");
			break;

		case 3:
			System.out.println(" : Tesoura");
			break;
		}
	}

	public void validaVitoria(int playerChose, int computerChose) {
		if (playerChose > computerChose && computerChose != 1 || playerChose == 1 && computerChose == 3) {
			System.out.println("JOGADOR GANHOU!");
		} else if (playerChose == computerChose) {
			System.out.println("EMPATE!");
		} else {
			System.out.println("COMPUTADOR GANHOU!");
		}
	}

}
