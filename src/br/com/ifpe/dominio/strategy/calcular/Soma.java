package br.com.ifpe.dominio.strategy.calcular;


import br.com.ifpe.dominio.strategy.CalcularCarrinho;

public class Soma implements CalcularCarrinho{

	@Override
	public int calcular(int num1, int num2) {
	
		return num1 + num2;
	
	}

}
