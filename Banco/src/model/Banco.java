package model;

public class Banco{
	private String cliente;
	private String cpf;
	private int tipo;
	private float saldo;
	
	public String getCliente() {
		return this.cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(float valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println(this.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println(this.getSaldo());
	}
	
	public void fecharConta() {
		if(this.saldo <= 0) {
			this.cliente = null;
			this.cpf = null;
		}
	}
}
