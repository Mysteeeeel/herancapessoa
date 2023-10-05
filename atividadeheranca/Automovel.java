package atividadeheranca;

public class Automovel extends Veiculo {
	
	private int numeroportas;
	private String motor;
	
	public Automovel(int numeroportas, String motor, String marca, String modelo, int ano, String cor) {
		super(marca, modelo, ano, cor);
		this.numeroportas = numeroportas;
		this.motor = motor;
	}

	public int getNumeroportas() {
		return numeroportas;
	}

	public void setNumeroportas(int numeroportas) {
		this.numeroportas = numeroportas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
}
