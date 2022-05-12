package projetoPOO;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vetor = new int[10];
		int primeiroNumero = 51;
		while(primeiroNumero > 50) {
			primeiroNumero = in.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = primeiroNumero;
			primeiroNumero *= 2;
		}
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
	}
}
