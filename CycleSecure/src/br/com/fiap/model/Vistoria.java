package br.com.fiap.model;

public class Vistoria {

	private int protocolo;
	private boolean aprovado;

	
	public Vistoria() {
	}
	
	public void realizarVistoria(){
		
		// Sequencia: Chassi, roda dianteira, guidão e quadro
		
		System.out.println(" ---- Iniciando processo de vistoria... ----\n1. Posicione sua bike em um lugar com boa iluminação, e se possível com fundo neutro.\n2. Tire uma foto do Chassi de sua bike\n3. Tire uma foto da roda dianteira da sua bike.\n4. Tire uma foto do guidão da sua bike.\n5. Para finalizar, tire uma foto do quadro da sua bike.\n");
		
	}
	
	public int getProtocolo() {
		return protocolo;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public String foiAprovado() {
		if (this.aprovado) {
			return "aprovada!";
	    } else {
			return "reprovada!";
	    }
	}
	
}
