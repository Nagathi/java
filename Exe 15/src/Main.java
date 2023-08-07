import java.util.*;
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))  {
			List <Cliente> clientes = new ArrayList();
			Conta c = null;
			
			System.out.println("Iniciar programa? S/N");
			String option = sc.next();
			
			while(!option.equalsIgnoreCase("N")) {
				
				System.out.println("================================");
				System.out.println("1 - Cadastrar Cliente");
				System.out.println("2 - Consultar Cliente(Indisponível)");
				System.out.println("3 - Mostrar Clientes");
				System.out.println("N - Encerrar Programa");
				System.out.println("================================");
				option = sc.next();
				
				if(option.equals("1")) {
					
					System.out.println("Digite o nome: ");
					String nome = sc.next();
					System.out.println("Digite o e-mail: ");
					String email = sc.next();
					
					Cliente cli = new Cliente(nome, email);
					
					System.out.println("Agora digite a quantidade de contas: ");
					int qtd = sc.nextInt();
					
					for(int i = 0; i < qtd; i++) {
						
						System.out.println("Escolha o tipo de conta: [1 - CC || 2 - CP]");
						int tipo = sc.nextInt();
						
						if(tipo == 1) {
							
							System.out.println("Digite o limite: ");
							float limite = sc.nextInt();
							c = new Corrente(limite);
							
						}
						if(tipo == 2) {
							
							c = new Poupanca();
							
						}
						
						System.out.println("Digite um valor de depósito: ");
						float val = sc.nextFloat();
						c.depositar(val);
						
						cli.incluirConta(c);
					
						
					}
					
					clientes.add(cli);
					System.out.println("Cadastrado!");

					
				}
				
				if(option.equals("2")) {
					
					System.out.print("Nome: ");
					String search = sc.next();
					System.out.println();
					
					Iterator it = clientes.iterator();
					
					while(it.hasNext()) {
						
						Cliente cli = (Cliente) it.next();
						
						if(search.equalsIgnoreCase(cli.getNome())) {
							
							System.out.println("=============================================");
							System.out.println("Nome: " + cli.getNome());
							System.out.println("Saldo: " + cli.getSaldoGeral());
							System.out.println("=============================================");
							
						}
						
					}
					
				}
				
				if(option.equals("3")) {
					
					Iterator it = clientes.iterator();
					
					while(it.hasNext()) {
						
						Cliente cli = (Cliente) it.next();
						
						System.out.println("=============================================");
						System.out.println("Nome: " + cli.getNome());
						System.out.println("Saldo: " + cli.getSaldoGeral());
						System.out.println("=============================================");
					}
				}
			}
		}
	}
}
