package Delivery;

public class Programa {

	public static void main(String[] args) {
		
	Menu menu = new Menu();
	TempoDeEntrega tempo = new TempoDeEntrega();
	Valores valor = new Valores();
	TabelaPrecos tabela = new TabelaPrecos();
	int opcao;
	
	tabela.mostrarPrecos();
	opcao = menu.chamarMenu();
	tempo.calcularTempo(opcao);
	valor.calcularValor(opcao);
	
	
	}



}
