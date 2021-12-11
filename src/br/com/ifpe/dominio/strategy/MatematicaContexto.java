package br.com.ifpe.dominio.strategy;



	public class MatematicaContexto {
		private CalcularCarrinho strategy;

		public MatematicaContexto(CalcularCarrinho strategy) {

			this.strategy = strategy;

		}
	
		public int calcular(int num1, int num2){
		
			return strategy.calcular(num1, num2);
		
		}
}
