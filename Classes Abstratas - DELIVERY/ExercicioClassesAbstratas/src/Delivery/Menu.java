package Delivery;

import java.util.Scanner;

public class Menu {
	
public int chamarMenu() {
	int opcao = 0;
	
	Sanduiche sandu = new Sanduiche();
	Massas massa = new Massas();
	Bolo bolo = new Bolo();
	Scanner leitor = new Scanner (System.in);
			
	System.out.println("Bem vindo ao *Delivery Golden Beef*");
	
	System.out.println("Selecione uma op��o: \n"
			+ "[1] Sandu�ches   [2] Massas   [3] Bolos");
	opcao =leitor.nextInt();
	while(opcao!= 1 && opcao!= 2 && opcao!=3) {
		System.out.println("Op��o Inv�lida! Por favor, escolha novamente");
		opcao =leitor.nextInt();
	}
	if(opcao ==1) {
		sandu.menuSandu();
	}
	else if(opcao==2) {
		massa.menuMassas();
	}
	else {
		bolo.menuBolos();
	}
	return opcao;
}

}
