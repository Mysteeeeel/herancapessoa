package atividadeheranca;

public class Principal {
	
	public static void main(String[] args) {
		
		Automovel automovel = new Automovel(4, "v8", "Chevrolet", "Onix", 2006, "Vermelho");
		
		System.out.println("Quantidade de portas: " + automovel.getNumeroportas());
		System.out.println("Motor: " + automovel.getMotor());
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		
		
        Moto moto = new Moto(220, "Honda", "nc70x", 2010, "preto");

        System.out.println("Cilindradas: " + moto.getCilindrada());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        
        Veiculo veiculo = new Veiculo("Ferrari", "Roma", 2021, "Vermelho");
        System.out.println("Marca: " +veiculo.getMarca());
        System.out.println("Modelo: " +veiculo.getModelo());
        System.out.println("Ano: " +veiculo.getAno());
        System.out.println("Cor: " +veiculo.getCor());
    }
	}
