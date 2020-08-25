package Delivery;

public class Valores {

	public void calcularValor(int opcaoSelecionada) {
		float preco;
		
		if(opcaoSelecionada ==1) {
			preco = 10;
			
		}
		else if(opcaoSelecionada ==2) {
			preco = 20;
			
		}
		else {
			preco = 30;
			
		}
		System.out.println("O mesmo custará R$"+preco+" reais");
	}
}
