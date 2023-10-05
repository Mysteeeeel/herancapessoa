package atividadeheranca;

public class Moto extends Veiculo {
	
	private int cilindrada;

	public Moto(int cilindrada, String marca, String modelo, int ano, String cor) {
		super(marca, modelo, ano, cor);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
