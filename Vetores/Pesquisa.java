package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// capturando numero
     
		Scanner leia = new Scanner(System.in);
       // criando variavel
        int numero;

        System.out.println("Digite um numero:");
       // alocando vetor
        int vetorInt[]={2,5,1,3,4,9,7,8,10,6};
        numero = leia.nextInt();

       // ordena os elementos do próprio array e retorna o array
        Arrays.sort(vetorInt);

       // regras se encontrar
        for (int contador =0; contador < vetorInt.length; contador ++) {
            if(vetorInt[contador]== numero) {
                System.out.println("O numero " + numero + " esta na posição [ " + contador +" ]");
                
      // regras se não encontrar
                
            }
            if (numero >= 10) {

                System.out.println("Número " + numero + " não encontrado! ");
                break;

        }
            leia.close(); 
        }

    }}