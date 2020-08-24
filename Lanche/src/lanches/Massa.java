package lanches;

public class Massa extends Lanche{
	private double tempo=30;
	private String massas[] = {"Macarrão", "Pizza", "Lasanha"};
	private String molho;
	
	public String[] getMassas() {
		return massas;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public void massaEscolhida(int i){
		System.out.println("A massa escolhida foi: " + massas[i-1] + " com molho de " + molho);
	}

	@Override
	public void tempoDeEspera() {
		tempo=tempo+km*10;
		if(tempo>60)
		{
			System.out.println("O tempo de espera é de : " + (int) (tempo/60) + " horas e " + (int)(tempo%60) + " minutos");
		}
		else
			System.out.println("O tempo de espera é de : " + (int)(tempo%60) + " minutos");
	}
}
