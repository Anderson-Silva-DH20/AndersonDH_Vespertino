package Delivery;

import java.util.Scanner;

public class Bolo {

	public void menuBolos() {
		Scanner leitor = new Scanner (System.in);
		int opcaoBolo;
		
		String escolhasBolo="No menu Bolos voc� escolheu as op��es a seguir:\n";
		String massasBolo[]= {"[1] P�o de L�","[2] Genoise","[3] Chiffon","[4] Amanteigada"};
		String recheioBolo[] = {"[1] Prest�gio","[2] Nutela","[3] Leite Ninho","[4] Oreo","[5] Buttercream"};
		String coberturaBolo [] = {"[1] Chocolate","[2] Morango"};
		
		System.out.println("Voc� selecionou a op��o Bolos. Vamos come�ar a mont�-lo?" );
		// Escolhendo a massa
		System.out.println("Primeiramente, escolha o tipo de massa\n"
				+ "[1] P�o de L� [2] Genoise [3] Chiffon [4] Amanteigada " );
		 opcaoBolo = leitor.nextInt();
		while (opcaoBolo>4 || opcaoBolo<1) {
			System.out.println("Op��o inv�lida. Escolha novamente \n"
					+ "[1] P�o de L� [2] Genoise [3] Chiffon [4] Amanteigada ");
			opcaoBolo = leitor.nextInt();
		}
		escolhasBolo+="Tipo de Massa: "+massasBolo[opcaoBolo-1]+"\n";
		
		//Ecolhendo o recheio
		System.out.println("Desta vez, escolha o recheio\n"
				+"[1] Prest�gio [2] Nutela [3] Leite Ninho [4] Oreo [5] Buttercream");
		opcaoBolo = leitor.nextInt();
		while (opcaoBolo>5 || opcaoBolo<1) {
			System.out.println("Op��o inv�lida. Escolha novamente \n"
					+ "[1] Prest�gio [2] Nutela [3] Leite Ninho [4] Oreo [5] Buttercream");
			opcaoBolo = leitor.nextInt();
		}
		escolhasBolo+="Recheio: "+recheioBolo[opcaoBolo-1]+"\n";
		
		//Escolhendo a cobertura
		
		System.out.println("Eu sei que voc� j� est� babando pelo bolo! hahahah\n"
				+"Para finalizar, defina a cobertura\n"
				+ "[1] Chocolate [2] Morango");
		opcaoBolo = leitor.nextInt();
		
		while (opcaoBolo>2 || opcaoBolo<1) {
			System.out.println("Op��o inv�lida. Escolha novamente \n"
					+ "[1] Chocolate [2] Morango");
			opcaoBolo = leitor.nextInt();
		}
		
		escolhasBolo += "Cobertura "+ coberturaBolo[opcaoBolo-1]; 
		System.out.println(escolhasBolo);
	}
}
