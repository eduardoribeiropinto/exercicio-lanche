package lanches;

public class Bolo extends Lanche{
	private double tempo=10;
	private String massa;
	private String recheio;
	private String cobertura;
	
	public void setMassa(String massa) {
		this.massa = massa;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public void boloEscolhido(){
		System.out.println("A massa escolhida foi: " + massa + " com recheio de " + recheio + " com cobertura de " + cobertura);
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
