package classeMae;

public class Veiculos {
	private double capacidadeTotalAtual;
	private String placaDoVeiculo;
	private String nomeVeiculo = "";
	//construtor
	public Veiculos() {
		this.capacidadeTotalAtual = 0;
		this.placaDoVeiculo = "PLACAINICIAL";
	}
	
	//setters
	public void mudarPlaca(String placaAMudar) {
		switch(placaAMudar) {
		case "":
			System.out.println("Placa invalida!Tente novamente!");
			break;
		case "PLACAINICIAL":
			System.out.println("Placa invalida! Digite uma placa nova que nao a inicial!");
			break;
		default:
			this.placaDoVeiculo = placaAMudar;
			break;
		}
	}
	
	public void qualACapacidade(double capacidade) {
		if(capacidade > 0) {
			this.capacidadeTotalAtual = capacidade;
		}
		else {
			System.out.println("Digite uma capacidade valida!");
		}
	}
	
	
	//getters
	public double capacidadeAtual() {
		return this.capacidadeTotalAtual;
	}
	
	public String placaAtual() {
		return this.placaDoVeiculo;
	}
}
