package projetoPOO;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		while(true) {
			n = in.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(n * n);
		}
	}
}
