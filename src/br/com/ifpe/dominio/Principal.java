package br.com.ifpe.dominio;

import javax.swing.JOptionPane;


import br.com.edu.ifpe.dominio.pagamento.Pagamento;
import br.com.edu.ifpe.dominio.pagamento.PagamentoEscolha;
import br.com.ifpe.dominio.strategy.MatematicaContexto;
import br.com.ifpe.dominio.strategy.calcular.Soma;
import br.edu.ifpe.dominio.mercado.facade.MercadoFacade;

public class Principal {
	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog(null);
		
		Pagamento mensagem = PagamentoEscolha.getPagamento(2);
		mensagem.enviar(texto);
		
		MercadoFacade facade = new MercadoFacade();
		facade.montarCarrinho();
		
		MatematicaContexto math = new MatematicaContexto(new Soma());
		
		System.out.println(math.calcular(80, 100));
		
	}
}
