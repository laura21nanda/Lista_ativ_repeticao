package Repeticaoex;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double soma = 0, num;

		for(int i = 0; i <=9;  i++) {
			System.out.println("Informe um número ");
			num = ler.nextDouble();
			soma = soma +num;
		}
		System.out.println("O resultado da soma é : " +soma);
	}

	}

