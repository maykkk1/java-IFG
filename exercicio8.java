package projetoPOO;

import java.util.Scanner;

public class exercicio8 {
	public static float calculaMedia(float nota1, float nota2) {
		return (nota1 + nota2) / 2;
	} 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float nota1;
		float nota2;
		int continuar;
		
		while(true) {
			nota1 = -1;
			while(true) {
				nota1 = in.nextFloat();
				if (nota1 >= 0 && nota1 <= 10) break;
				System.out.println("nota invalida");
			}
			nota2 = -1;
			while(true) {
				nota2 = in.nextFloat();
				if (nota2 >= 0 && nota2 <= 10) break;
				System.out.println("nota invalida");
			}
			String media = String.format("%.2f", calculaMedia(nota1, nota2));
			System.out.println("Media = " + media);
			System.out.println("novo calculo (1-sim 2-nao)");
			while(true) {
				continuar = in.nextInt();
				if (continuar == 1 || continuar == 2) break;
			}
			if (continuar == 2) break;
			
		}
	}
}
