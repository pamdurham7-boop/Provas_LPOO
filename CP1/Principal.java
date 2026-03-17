package br.com.fiapride.model;

public class Principal {
	public static void main(String[] args) {
		Veiculos veiculo_1 = new Veiculos();
		
		veiculo_1.set_dono_carro("Carlos");
		veiculo_1.set_placa_carro("ABC-1234");
		veiculo_1.set_gasolina_atual(100);
		
		veiculo_1.adicionar_gasolina(50);
		veiculo_1.gastar_gasolina(100);
		
		double gasolina_atual = veiculo_1.get_gasolina_atual();
		String dono_carro = veiculo_1.get_dono_carro();
		String placa_carro = veiculo_1.get_placa_carro();
		

		
		System.out.println("Dono do Automovel: "+ dono_carro + "\nPlaca do carro: " + placa_carro + "\nGasolina Atual: " + gasolina_atual);
	}
}
