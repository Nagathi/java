package exec;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor do teclado: ");
		String valor = sc.next();
		try {
			while(!valor.equalsIgnoreCase("fim")) {
				System.out.println("Digite novamente: ");
				valor = sc.next();
				System.out.println("Digitou: " + valor);
			}
		}
		catch(Exception e) {
			System.out.println("erro" + e);
		}

	}

}
