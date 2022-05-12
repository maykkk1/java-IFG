package projetoPOO;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float media = 0;
		int idade;
		int contador = 0;
		while(true) {
			idade = in.nextInt();	
			if(idade < 0) break;
			contador++;
			media += idade;	
		}
		
		if(contador == 0) {
			System.out.println("impossivel calcular");
		} else {
			media/=contador;
			System.out.println(String.format("%.2f", media));
		}
	}

}
