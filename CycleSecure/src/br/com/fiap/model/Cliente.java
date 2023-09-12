package br.com.fiap.model;

import java.util.Scanner;

import br.com.fiap.data.ClienteDao;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String dataNascimento;
	private String email;
	private String cpf;
	private String endereco;
	private String senha;
	private ClienteDao novoCliente = new ClienteDao();
	
	public Cliente(){
	}

	public void cadastrarCliente(){

		var cliente = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n---- CADASTRO ----\n");
		System.out.print("Informe seu nome: ");
		cliente.setNome(scan.nextLine());
		System.out.print("Informe sua data de nascimento: ");
		cliente.setDataNascimento(scan.nextLine());
		System.out.print("Informe seu CPF: ");
		cliente.setCpf(scan.nextLine());	
		System.out.print("Informe seu endereço: ");
		cliente.setEndereco(scan.nextLine());		
		
		System.out.print("Informe seu email: ");
		cliente.setEmail(scan.nextLine());		

		try {
			novoCliente.inserir(cliente);
			System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro, cliente não cadastrado!");
        }

		scan.close();
	}
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
