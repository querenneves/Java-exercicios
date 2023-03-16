package Condicionais;

import java.util.Scanner;

public class BnacoSangue {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
//variaveis
		String nome;
		int idade;
		boolean doacao = false;
		char pergunta;

		System.out.println("Digite nome: ");
		nome = leia.nextLine();
        leia.skip("\\R?");
        
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação?: (Responda com s ou n)");
		leia.skip("\\R?");
		pergunta = leia.nextLine().charAt(0);
		
		//condições

		if (pergunta == 's')
			doacao = true;

		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome  + "Não Apto!");
			else
				System.out.println(nome + "Não Apto!");
		} else if (idade < 18 || idade > 69)
			System.out.println(nome + "Não Apto!");
		else
			System.out.println(nome + "n/Apto");
	}

}
