package br.com.edu.ifpe.dominio.pagamento;

import javax.swing.JOptionPane;

public class PagamentoAvista implements Pagamento{
	
	@Override
	public void enviar(String pagamento) {
		JOptionPane.showMessageDialog(null, "Forma de pagamento Avista: " + pagamento);
	}

}