package br.com.edu.ifpe.dominio.pagamento;



public class PagamentoEscolha {

	public static Pagamento getPagamento(int i){
		if(i == 1 ){
			return new PagamentoCartao();
		}else if(i == 2){
			return new PagamentoAvista();
		
		}else{
			return new PagamentoAvista();
		}
	}
}
