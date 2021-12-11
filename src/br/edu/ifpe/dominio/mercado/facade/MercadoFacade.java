package br.edu.ifpe.dominio.mercado.facade;

import br.edu.ifpe.dominio.mercado.produto.Arroz;
import br.edu.ifpe.dominio.mercado.produto.Carne;
import br.edu.ifpe.dominio.mercado.produto.Farinha;
import br.edu.ifpe.dominio.mercado.produto.Feijao;

public class MercadoFacade {

	private Feijao feijao;
	private Arroz arroz;
	private Farinha farinha;
	private Carne carne;

	public MercadoFacade() {

		this.feijao = new Feijao();
		this.arroz = new Arroz();
		this.farinha = new Farinha();
		this.carne = new Carne();

	}

	public void montarCarrinho() {
		System.out.println("Montando um novo carinho\n");
		
		feijao.adicionarFeijao();
		arroz.adicionarArroz();
		farinha.adicionarFarinha();
		carne.adicionarCarne();
		
		System.out.println("\nCarrinho Pronto");
	}

}
