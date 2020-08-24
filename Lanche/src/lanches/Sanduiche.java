package lanches;

public class Sanduiche extends Lanche{

	private double tempo=15;
	private String ingredientes[] = {"Big Mac", "Cheddar McMelt", "Clássicos do Dia", "McNífico Bacon",
		    "Quarterão", "Triplo Burger Bacon", "Triplo Cheeseburger", "Triplo Tasty", "Picanha Clubhouse 1", "McPicanha"};

	public void lancheEscolhido(int i){
		System.out.println("O lanche escolhido foi: " + ingredientes[i]);
	}
	
	public void menuSanduiche() {
		for(int i=0;i<10;i++)
			{
				System.out.println(i + " - " + ingredientes[i]);
			}
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
