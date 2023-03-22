package estruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Menu {

		public static void main(String[] args) {
			Queue<String> fila = new LinkedList<String>();
			
			Scanner leia = new Scanner(System.in);
			
			int opcao = 0;
			String nome = "";
			
			do {			
				System.out.println("----------------------------------------");
				System.out.println("1 - Adicionar um novo cliente na fila");
				System.out.println("2 - Listar todos os Clientes na fila");
				System.out.println("3 - Retirar uma pessoa da fila ");
				System.out.println("0 - Finalizar programa\n");
				System.out.println("Entre com a opção desejada: ");
				
				opcao = leia.nextInt();
				
				switch (opcao) {
				
				case 1:
					System.out.println("----- Adicionar um novo cliente ----- ");
					System.out.println("Digite o nome do cliente: ");
					
					nome = leia.next();
					fila.add(nome);

					System.out.println("Cliente Adicionado! \n");
					break;
					
				case 2:
					System.out.println("----- Listagem de clientes ----- ");
					
					for(var elemento : fila)
						System.out.println(elemento);
									
					break;
					
				case 3:
					System.out.println("----- Retirar a primeira pessoa da fila -----");
					fila.poll();
					
					System.out.println("O Cliente foi Chamado! \n");
					break;
					

				default:
					if (opcao > 3)
					System.out.println("Opção invalida \n");
					break;
				}
				
			} while (opcao != 0);
			
			
				
			System.out.println("Programa finalizado! ");

			leia.close();
		}

	}