package Repeticaoex;

import java.util.Scanner;

public class Ativ5While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma =0, i=0;
        double idade;

		while (i<=19) {
			System.out.println("Informe a idade ");
			idade = ler.nextDouble();
			soma += idade;
			i++;
		}
		System.out.println("O resultado da soma das idades é : " +soma);

	}

}
