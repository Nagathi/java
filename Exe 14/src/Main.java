import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String tel = "";
		
		HashMap <String, String> telefones = new HashMap();
		
		do {
			System.out.print("Digite o nome (Fim pra encerrar): ");
			nome = sc.next();
			System.out.println();
			
			if(!nome.equalsIgnoreCase("Fim")) {
				System.out.print("Digite o telefone: ");
				tel = sc.next();
				System.out.println();
				
				telefones.put(nome, tel);
			}		
		}while(!nome.equalsIgnoreCase("Fim"));
		
		System.out.print("Digite o nome: ");
		String search = sc.next();
		
		for(HashMap.Entry<String, String> set : telefones.entrySet()) {
			if(search.equalsIgnoreCase(set.getKey())) {
				System.out.println("nome: " + set.getKey() + ", telefone: "+ set.getValue());
			}
		}
	}
}
