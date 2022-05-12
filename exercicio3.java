package projetoPOO;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = in.nextInt();
			if(vetor[i] < 1) {
				vetor[i] = 1;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("X[" + i + "] = " + vetor[i]);
		}
	}
}
