package classesFilha;
import classeMae.Veiculos;

public class Moto extends Veiculos{
	private boolean bau;
	
	public void poeBau(boolean opcao) {
		this.bau = opcao;
	}
	
	public boolean temBau() {
		return this.bau;
	}
}
