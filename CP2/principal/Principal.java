package principal;

import classeMae.Pacote;
import classeMae.Rota;

import classesFilha.*;

public class Principal {
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		caminhao.mudarPlaca("ABC1234");
		caminhao.qualACapacidade(-500);
		
		Pacote pacote = new Pacote();
		pacote.porCodigoDeEnvio("BR999");
		pacote.quantoPesa(10.5);
		pacote.atualizarStatus("Pendente");
		
		Rota rota = new Rota(caminhao, pacote);
	}
}
