package classesFilha;
import classeMae.Veiculos;

public class Caminhao extends Veiculos{
	private int numeroDeEixos;
	
	
	public void quantosEixos(int quantidade) {
		if(quantidade > 4 && (quantidade/2 == 0)) {
			this.numeroDeEixos = quantidade;
		}
		else {
			System.out.println("Nao e possivel ter esta quantidade de eixos! Tente novamente mais tarde!");
		}
	}
	
	public int quantidadeAtualDeEixos() {
		return this.numeroDeEixos;
	}
}
