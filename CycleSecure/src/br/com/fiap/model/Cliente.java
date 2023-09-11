package br.com.fiap.model;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String email;
	private String dataNascimento;
	private String cpf;
	private String rg;
	private String endereco;
	private String complemento;
	private String numeroEndereco;
	private String senha;
	private String confirmacaoSenha;
	private String confirmaEmail;
	 
	
	public Cliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getConfirmaEmail() {
		return confirmaEmail;
	}

	public void setConfirmaEmail(String confirmaEmail) {
		this.confirmaEmail = confirmaEmail;
	}

	public boolean verificarEmail(String email, String confirmaEmail) {
	    return email.equals(confirmaEmail);
	}
	
	public void retornaVerificaEmail(String email, String confirmaEmail) {
		if (verificarEmail(email, confirmaEmail) == false) {
			System.out.println("Email incompativeis!");
		} else {
			System.out.println("Email compativeis!");	
		}
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public boolean verificarSenha(String senha, String confirmacaoSenha) {
	    return senha.equals(confirmacaoSenha);
	}
	
	public void retornaVerificaSenha(String senha, String confirmacaoSenha) {
		if (verificarSenha(senha, confirmacaoSenha) == false) {
			System.out.println("Senhas incompativeis!");
		} else {
			System.out.println("Senhas compativeis!");
			
		}
	}
}
