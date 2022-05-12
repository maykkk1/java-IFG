package projetoPOO;

import java.util.Scanner;

public class exercicio10 {
	
	public static String jogar(String sheldon, String raj) {
		if(sheldon.equals(raj)) return "De novo!";
		
		
		if (sheldon.equals("pedra")) {
			if(raj.equals("tesoura") || raj.equals("lagarto")) {
				return "Bazinga!";
			} else {
				return "Raj trapaceou!";
			}
		}
		
		if (sheldon.equals("papel")) {
			if(raj.equals("pedra") || raj.equals("Spock")) {
				return "Bazinga!";
			} else {
				return "Raj trapaceou!";
			}
		}
		
		
		if (sheldon.equals("tesoura")) {
			if(raj.equals("papel") || raj.equals("lagarto")) {
				return "Bazinga!";
			} else {
				return "Raj trapaceou!";
			}
		}
		
		
		
		if (sheldon.equals("lagarto")) {
			if(raj.equals("papel") || raj.equals("Spock")) {
				return "Bazinga!";
			} else {
				return "Raj trapaceou!";
			}
		}
		
		
		if (sheldon.equals("Spock")) {
			if(raj.equals("pedra") || raj.equals("tesoura")) {
				return "Bazinga!";
			} else {
				return "Raj trapaceou!";
			}
		}
		
		return "jogada inválida";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = 0;
		while (T < 1 || T > 100) {
			T = in.nextInt();
		}
		in.nextLine();
		String jogada;
		for (int i = 1; i <= T; i++) {
			jogada = in.nextLine();
			String[] jogadas = jogada.split(" ");
			String Sheldon = jogadas[0];
			String Raj = jogadas[1];
			System.out.println("Caso #" + i + ": " + jogar(Sheldon, Raj));
		}
		
	}
}
