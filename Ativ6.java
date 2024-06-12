package Repeticaoex;

import java.util.Scanner;

public class Ativ6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double soma= 0, idade, media = 0;

		for(int i = 0; i <=19;  i++) {
			System.out.println("Informe a idade ");
			idade = ler.nextDouble();
			 soma  = soma +idade;
			 media = soma/19;
		}
		System.out.println("O resultado da média das idades é : " +media);

	}

}
