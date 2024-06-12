package Repeticaoex;
import java.util.Scanner;
public class Ativ4While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma =0, i=0;
        double num;

		while (i<=9) {
			System.out.println("Informe um número");
			num = ler.nextDouble();
			soma += num;
			i++;
		}
		System.out.println("O resultado é : " +soma);

	}

}
