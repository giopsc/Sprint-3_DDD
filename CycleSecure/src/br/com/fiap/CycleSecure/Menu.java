package br.com.fiap.CycleSecure;

import java.util.Scanner;

import br.com.fiap.model.Bike;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Vistoria;

public class Menu {

	// Realizar vistoria, Cadastrar cliente, Cadastrar bike, Inserir bike no BD
	// Futuramente: transformar classes em records

	public static void main(String[] args) {
		var menu = new Menu();
		menu.menu();
		// bike.cadastrarBike();
	}

	public void menu(){
		// Realizar cadastro, Vistoria, Cadastrar bike
		Scanner scan = new Scanner(System.in);
		System.out.println(" ---- CycleSecure ---- \n1. Cadastrar-se.\n2. Realizar vistoria.\n3. Cadastrar bike.\n4. Sair do sistema");
		String opcao = scan.nextLine();

		switch (opcao) {
			case "1":
				var cliente = new Cliente();
				cliente.cadastrarCliente();
				break;
			case "2":
				var vistoria = new Vistoria();
				vistoria.realizarVistoria();
				break;
			case "3":
				var bike = new Bike();
				bike.cadastrarBike();
				break;
			case "4":
				System.out.println("\nSaindo do sistema...\n");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
		scan.close();
	}
}