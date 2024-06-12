package Repeticaoex;

import java.util.Scanner;

public class Ativ3While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome;
		int i=0;
		
		while (i<= 9) {
			i++;
			System.out.println("Informe o nome  ");
			nome = ler.next();
		}
		ler.close();
	}
}