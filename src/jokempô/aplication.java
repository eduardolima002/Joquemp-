package jokempô;

import java.util.Random;
import java.util.Scanner;

public class aplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		PlaySystem p = new PlaySystem();

		int playerChose= 0;
		int computerChose;
		while (playerChose != 4) {
			System.out.println();
			System.out.printf("1 - Pedra 2 - Papel  3 - Tesoura  4 - Parar o game%n");
			System.out.println();
			System.out.print("Type your play: ");
			playerChose = s.nextInt();
			System.out.println();
			System.out.print("Player");
			p.imprimeEscolha(playerChose);

			computerChose = random.nextInt(3) + 1;
			System.out.print("Computer");
			p.imprimeEscolha(computerChose);
			System.out.println();
			p.validaVitoria(playerChose, computerChose);
		}
	}
}
