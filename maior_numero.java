package PSII;

import java.util.Scanner;

public class maior_numero {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		double numero_1, numero_2,maior;
		System.out.println("..:Maior Numero:..");
		System.out.println("Qual o primeiro numero?");
		numero_1 = dados.nextDouble();
		System.out.println("Qual o segundo numero?");
		numero_2 = dados.nextDouble();
		if (numero_1 > numero_2) 
			maior = numero_1;
		else
			maior= numero_2;
		System.out.print("Maior Numero = " + maior);
	}	
}