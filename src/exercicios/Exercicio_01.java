package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		float salario, abono, resultado;
		
		System.out.println("Digite seu salário: ");
		salario=leia.nextFloat();
		System.out.println("Digite seu abono: ");
		abono=leia.nextFloat();
		
		resultado = salario + abono;
		System.out.println("Seu novo salário é: "+ resultado);
	}

}
