package br.com.senaitaguatinga.app4;

public class VoeAirlines {

	private int saldo = 5000;
	private int numClientes = 10;
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	public int dividirSaldo() {
		return this.saldo/this.numClientes;
	}
	
}
