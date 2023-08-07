import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<String> lista = new ArrayList<String>();
		lista.add("Gustavo");
		lista.add("Java");
		lista.add("Angular");
		lista.add("Spring");
		lista.add("JPA");
		
		for(String li : lista) {
			System.out.println(li);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String valor = it.next();
			System.out.println(valor);
		}
	}
}
