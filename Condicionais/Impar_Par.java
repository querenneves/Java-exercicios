package Condicionais;

import java.util.Scanner;

public class Impar_Par {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		
		int numero;
		char letra;
		
        //capturar informações
		 
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero%2==0) {
		System.out.println("O numero é par.\n");
		} else {
			System.out.println("O numero não é par.\n");
		if(numero<0) {
				System.out.println("O numero é negativo\\n");
			}else {
				System.out.println("O numero é positivo\n");
			}
			leia.close();
		} 
	}

}