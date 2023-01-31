package br.com.senaitaguatinga.app4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		VoeAirlines companiaAerea = new VoeAirlines();
		
		JOptionPane.showMessageDialog(null, "Dividindo 5000R$ para 10 clientes especiais da voeAirlines:\n 5000/10: "+ companiaAerea.dividirSaldo());

	}

}
