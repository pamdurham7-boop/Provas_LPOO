package br.com.fiapride.model;

public class Veiculos {
	private String dono_carro;
	private String placa_carro;
	private double gasolina_atual;
	
	
	public void set_gasolina_atual(double gasolina_atual) {
		this.gasolina_atual = gasolina_atual;
	}
	
	public double get_gasolina_atual() {
		return this.gasolina_atual;
	}
	public void set_placa_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}
	
	public String get_placa_carro() {
		return this.placa_carro;
	}
	public void set_dono_carro(String dono_carro) {
		this.dono_carro = dono_carro;
	}
	
	public String get_dono_carro() {
		return this.dono_carro;
	}
	
	
	public void adicionar_gasolina(double adicao_gasolina){
		this.gasolina_atual = this.gasolina_atual + adicao_gasolina;
	}
	
	public void gastar_gasolina(double gasolina_gasta) {
		this.gasolina_atual = this.gasolina_atual - gasolina_gasta;
	}
	
}
