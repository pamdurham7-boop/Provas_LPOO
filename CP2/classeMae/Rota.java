package classeMae;

public class Rota {
	public Rota(Veiculos veiculo, Pacote pacote) {
		System.out.println("Levando pacote " + pacote.obterCodigoDeEnvio() + " no veículo " + veiculo.placaAtual());
	}
	
}
