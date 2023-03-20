package Matriz;

import java.util.Scanner;

public class ExibirNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int[] [] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria ="";
		
		for(int Ilinha = 0; Ilinha < matriz.length; Ilinha ++ ) {
			
			for(int IColuna = 0; IColuna < matriz.length; IColuna ++ ) {
				System.out.println("Digite um número: ");
				matriz[Ilinha][IColuna] = leia.nextInt();
			}
		}
		for(int Ilinha = 0; Ilinha < matriz.length; Ilinha ++ ) {
			diagonalPrincipal += matriz[Ilinha][Ilinha] + "";
			somaPrincipal += matriz[Ilinha][Ilinha];
			
			diagonalSecundaria += matriz[Ilinha][matriz.length - 1 - Ilinha] + "";
			somaSecundaria += matriz[Ilinha][matriz.length - 1 - Ilinha];
		}
		System.out.println("Elementos da Diagonal Principal:\n");
	    System.out.println(diagonalPrincipal);
	    System.out.println("Elementos da Diagonal Principal:\n");
	    System.out.println(diagonalSecundaria);
	    System.out.println("Elementos da Diagonal Principal:\n");
	    System.out.println(somaPrincipal);
	    System.out.println("Elementos da Diagonal Principal:\n");
	    System.out.println(somaSecundaria);
	    
	    leia.close(); 
		}
	}
	