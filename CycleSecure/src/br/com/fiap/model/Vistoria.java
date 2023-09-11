package br.com.fiap.model;

public class Vistoria {

	private int protocolo;
	private boolean aprovado;

	public Vistoria(int protocolo, boolean aprovado) {
	this.protocolo = protocolo;
	this.aprovado = aprovado;
	}

	public int getProtocolo() {
	return protocolo;
	}
	
	public String foiAprovado() {
	    if (this.aprovado) {
	        return "aprovada!";
	    } else {
	        return "reprovada!";
	    }
	}
	
}
