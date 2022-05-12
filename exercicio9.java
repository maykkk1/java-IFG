package projetoPOO;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		while(n < 1 || n > 1000) {
			n = in.nextInt();
		}
		int partesCirculo = 1;
		for (int i = 0; i < n; i++) {
			if(i > 0) {
				partesCirculo *= 2;
			}
		}
		System.out.println(partesCirculo);
	}
}
