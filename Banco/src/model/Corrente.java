package model;

public class Corrente extends Banco {
	public Corrente(String nome, String cpf) {
		this.setCliente(nome);
		this.setCpf(cpf);
		this.setTipo(1);
		this.setSaldo(50);
	}
}
