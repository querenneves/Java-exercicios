package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio_04 {
	
	public static void main(String[] args) {
	
	float numero1, numero2, numero3, numero4, calculo;
	Scanner leia = new Scanner(System.in);
			
	System.out.println("Digite o primeiro numero");
	numero1 = leia.nextFloat();
	
	System.out.println("Digite o segundo numero");
	numero2 = leia.nextFloat();
	
	System.out.println("Digite o terceiro numero");
	numero3 = leia.nextFloat();
	
	System.out.println("Digite o quarto numero");
	numero4 = leia.nextFloat();
	
	calculo = (numero1 * numero2)- (numero3 * numero4);
	
	System.out.println("O calculo é: " + (calculo));
	
	leia.close();

}
}
