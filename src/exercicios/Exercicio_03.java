package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
	
		
		float salarioBruto, noturno, horasExtras, descontos, salarioLiquido;	
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		noturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + noturno + (horasExtras * 5) - descontos;
		
		System.out.println("O salário liquido é: " + df.format(salarioLiquido));
		
		leia.close();
		
	

	}

}

