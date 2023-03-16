package Condicionais;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC;
		
		System.out.println("Digite o numero A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite a sua numeroB: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite a sua numeroC: ");
		numeroC = leia.nextInt();
		
		if ((numeroA + numeroB) > numeroC) 
		System.out.println("A Soma de A + B é Maior do que C");
		else if ((numeroA + numeroB) < numeroC) 
			System.out.println("A Soma de A + B é Menor do que C");
		else if ((numeroA + numeroB) == numeroC) 
			System.out.println("A Soma de A + B é Igual a C");
		
	}

	}
