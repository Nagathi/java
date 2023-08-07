package view;
import java.util.*;

import model.Banco;
import model.Corrente;
import model.Poupanca;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Banco> lista_de_contas = new ArrayList<Banco>();
				
		System.out.println("Digite uma opção");
		String op = sc.next();
				
		while(!op.equals("0")) {
			if(op.equals("1")) { //Conta corrente 
				System.out.println("Digite o nome");
				String nome = sc.next();
				System.out.println("Digite o cpf");
				String cpf = sc.next();
				Banco corrente = new Corrente(nome, cpf);
				lista_de_contas.add(corrente);
				System.out.println("========================");
			}
			if(op.equals("2")) { //Conta Poupanca 
				System.out.println("Digite o nome");
				String nome = sc.next();
				System.out.println("Digite o cpf");
				String cpf = sc.next();
				Banco poupanca = new Poupanca(nome, cpf);
				lista_de_contas.add(poupanca);
				System.out.println("========================");
			}
			if(op.equals("3")) {
				System.out.println("Informe um cpf");
				String cpf = sc.next();
				for(Banco b : lista_de_contas) {
					if(cpf.equals(b.getCpf()) && b.getSaldo() <= 0) {
						b.fecharConta();
					}
				}
			}
			
			if(op.equals("4")) {
				for(int i = 0; i < lista_de_contas.size(); i++) {
					Banco bc = (Banco) lista_de_contas.get(i);
					System.out.println(bc.getCliente());
					System.out.println(bc.getSaldo());
				}
			}	
			if(op.equals("5")) {
				System.out.println("Informe um cpf");
				String cpf = sc.next();
				System.out.println("Informe um valor");
				float valor = sc.nextFloat();
				for(Banco b : lista_de_contas) {
					if(cpf.equals(b.getCpf())) {
						b.sacar(valor);
					}
				}
			}
			if(op.equals("6")) {
				System.out.println("Informe um cpf");
				String cpf = sc.next();
				System.out.println("Informe um valor");
				float valor = sc.nextFloat();
				for(Banco b : lista_de_contas) {
					if(cpf.equals(b.getCpf())) {
						b.depositar(valor);
					}
				}
			}
			
			System.out.println("Digite uma opção");
			System.out.println("1 - Criar conta corrente");
			System.out.println("2 - Criar conta poupança");
			System.out.println("3 - Encerrar conta");
			System.out.println("4 - Listar clientes");
			System.out.println("5 - Saque");
			System.out.println("6 - Depósito");
			op = sc.next();
		}
		
		
	}
}
