package classeMae;

public class Pacote {
 private String codigoDeEnvio;
 private double peso;
 private String statusDaEntrega;

 public void atualizarStatus(String statusAtual) {
	 if(statusAtual == "Pendente"|| statusAtual == "Entregue") {
		 this.statusDaEntrega = statusAtual;
	 }
	 else {
		 System.out.println("Digite um valor valido para o status do pacote");
	 }
 }
 
 public void quantoPesa(double peso) {
	 if(peso > 0) {
		 this.peso = peso;
	 }
	 else {
		 System.out.println("Digite um peso de pacote valido!");
	 }
 }
 
 public void porCodigoDeEnvio(String codigo) {
	 if(codigo == "") {
		 System.out.println("Digite um código válido");
	 }
	 else {
		 this.codigoDeEnvio = codigo;
	 }
 }
 
 public String obterCodigoDeEnvio() {
	 return this.codigoDeEnvio;
 }
 public String obterStatus() {
	 return this.statusDaEntrega;
 }
 public double obterPeso() {
	 return this.peso;
 }
 
}