import java.util.*;
import java.io.*;
//Utilizar Scanner, Collections


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String valor = "";
		
		Vector <String> vetor = new Vector(); 
		
		do{

			System.out.print("Digite coisas (Fim pra encerrar): ");
			valor = sc.next();
			System.out.println();
			
			if(!valor.equalsIgnoreCase("Fim")) {
				vetor.add(valor);
			}
			
		}while(!valor.equalsIgnoreCase("Fim"));
		
		for(int i = vetor.size() - 1; i >= 0; i--) {
			System.out.println(vetor.get(i));
		}

		for(Iterator <String> it = vetor.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
