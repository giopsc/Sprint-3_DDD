package br.com.fiap.CycleSecure;

import java.util.Scanner;

import br.com.fiap.model.Bike;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Vistoria;

public class Menu {

	public static void main(String[] args) {
		
		Vistoria vistoria = new Vistoria(3567892, true);
		Cliente cliente = new Cliente(1335);
		Bike bike = new Bike(3267439);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===CADASTRO===\n");
		cliente.getIdCliente();
		System.out.print("Informe seu nome: ");
		cliente.setNome(scan.nextLine());
		System.out.print("Informe sua data de nascimento: ");
		cliente.setDataNascimento(scan.nextLine());
		System.out.print("Informe seu CPF: ");
		cliente.setCpf(scan.nextLine());	
		System.out.print("Informe seu RG: ");
		cliente.setRg(scan.nextLine());		
		System.out.print("Informe seu endereço: ");
		cliente.setEndereco(scan.nextLine());		
		System.out.print("Informe o número da sua casa: ");
		cliente.setNumeroEndereco(scan.nextLine());		
		System.out.print("Informe o complemento se tiver: ");
		cliente.setComplemento(scan.nextLine());		
		
		System.out.print("Informe seu email: ");
		cliente.setEmail(scan.nextLine());		
		System.out.print("Confirme seu email: ");
		String confirmaEmail = scan.nextLine();
		
		System.out.print("Informe sua senha: ");
		cliente.setSenha(scan.nextLine());		
		System.out.print("Confirme sua senha: ");
		String confirmaSenha = scan.nextLine();
		
		
		System.out.println("\n=== CADASTRO BIKE ===\n");
		bike.getIdBike();
		System.out.print("Informe um nome de identificacao para sua Bike: ");
		bike.setNome(scan.nextLine());
		System.out.print("Informe a marca da sua Bike: ");
		bike.setMarca(scan.nextLine());
		System.out.print("Informe o modelo da sua Bike: ");
		String modelo = scan.nextLine();
		System.out.print("Informe a cor da sua Bike: ");
		String cor = scan.nextLine();
		System.out.print("Informe a categoria da sua Bike: ");
		String categoria = scan.nextLine();
		System.out.print("Informe o chassi da sua Bike: ");
		String chassi = scan.nextLine();
		System.out.print("Informe o valor total da sua Bike: ");
		String valorTotalString = scan.nextLine();
		int valorTotal = Integer.parseInt(valorTotalString);
		System.out.print("Sua Bike ja sofreu alguma modificacao? ");
		String modificacao = scan.nextLine();
		System.out.print("Sua Bike ja sofreu algum acidente? ");
		String acidente = scan.nextLine();
		
		bike.setModelo(modelo);
		bike.setCor(cor);
		bike.setChassi(chassi);
		bike.setValor(valorTotal);
		bike.setModificacao(modificacao);
		bike.setAcidente(acidente);
		
		String msg = String.format("\nID Cliente: %s \nNome Cliente: %s\nSituacao da Vistoria: A vistoria da bike %s "
				+ "identificada como %s do modelo %s foi %s", 
				cliente.getIdCliente(), cliente.getNome(), bike.getIdBike(), bike.getNome(), bike.getModelo(), vistoria.foiAprovado());
		System.out.println(msg);
		
	}
}