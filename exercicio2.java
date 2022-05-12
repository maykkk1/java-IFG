package projetoPOO;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			vetor[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}
}
