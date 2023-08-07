import java.util.*;

import javax.tools.JavaCompiler.CompilationTask;
public class Cliente {
	
	private String nome;
	private String email;
	private List <Conta> contas = new ArrayList();
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void incluirConta(Conta conta) {
		contas.add(conta);
	}
	
	public float getSaldoGeral() {
		
		float somaSaldo = 0f;
		
		Iterator<Conta> it = contas.iterator();
		
		while(it.hasNext()) {
			Conta c = (Conta) it.next();
			somaSaldo += c.getSaldo();
		}
		return somaSaldo; 
	}
}