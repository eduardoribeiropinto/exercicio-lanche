package lanches;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		System.out.println("Escolha o que deseja comer: [1] sanduiches, [2] massas, [3] bolos");
		opcao = teclado.nextInt();
		if (opcao ==1)
		{
			lanche = new Sanduiche();
			System.out.println("Escolha uma das opções:");
			((Sanduiche) lanche).menuSanduiche();
			opcao = teclado.nextInt();
			((Sanduiche) lanche).lancheEscolhido(opcao);
			
			System.out.println("Informe a distancia em km:");
			((Sanduiche) lanche).km = teclado.nextInt();
			((Sanduiche) lanche).tempoDeEspera();
		}
		else if(opcao == 2)
		{
			lanche = new Massa();
			System.out.println("Escolha uma das opções: [1] Macarrao, [2] Pizza, [3] Lasanha");
			opcao = teclado.nextInt();
			System.out.println ("Escolha o molho de sua preferencia: ");
			String molho = teclado.next();
			
			((Massa) lanche).setMolho(molho);
			((Massa) lanche).massaEscolhida(opcao);
	
			System.out.println("Informe a distancia em km:");
			((Massa) lanche).km = teclado.nextInt();
			((Massa) lanche).tempoDeEspera();
		}
		else
		{
			lanche = new Bolo();
			System.out.println("Escolha o massa: ");
			String massa = teclado.next();
			System.out.println("Escolha o recheio: ");
			String recheio = teclado.next();
			System.out.println("Escolha o cobertura: ");
			String cobertura = teclado.next();
			((Bolo) lanche).setCobertura(cobertura);
			((Bolo) lanche).setMassa(massa);
			((Bolo) lanche).setRecheio(recheio);
			((Bolo) lanche).boloEscolhido();
			
			System.out.println("Informe a distancia em km:");
			((Bolo) lanche).km = teclado.nextInt();
			((Bolo) lanche).tempoDeEspera();
		}
	}
}
