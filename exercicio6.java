package projetoPOO;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quatidade de alunos: ");
		int QuantidadeAlunos = in.nextInt();
		float[] notas = new float[QuantidadeAlunos];
		for(int i = 0; i < QuantidadeAlunos; i++) {
			System.out.println("Digite a primeira nota do aluno " + (i+1));
			float nota1 = in.nextFloat();
			System.out.println("Digite a segunda nota do aluno " + (i+1));
			float nota2 = in.nextFloat();
			System.out.println("Digite a terceira nota do aluno " + (i+1));
			float nota3 = in.nextFloat();
			float media = nota1 + nota2 + nota3;
			notas[i] = media;
		}
		
		for(int i = 0; i < QuantidadeAlunos; i++) {
			System.out.println(String.format("%.2f", notas[i]));
		}
	}
}
