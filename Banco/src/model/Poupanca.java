package model;

public class Poupanca extends Banco {
	public Poupanca(String nome, String cpf) {
		this.setCliente(nome);
		this.setCpf(cpf);
		this.setTipo(1);
		this.setSaldo(150);
	}
}
