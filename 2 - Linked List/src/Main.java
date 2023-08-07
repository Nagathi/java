import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<String> linked = new LinkedList<String>();
		GustavoList lista = new GustavoList();
		lista.add(10);
		lista.add(1);
		lista.add(5);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		linked.add("Gustavo");
		linked.add("Java");
		linked.add("Angular");
		linked.add("Spring");
		linked.add("JPA");
		
		for(String li : linked) {
			System.out.println(li);
		}
		
		for(int i = 0; i < linked.size(); i++) {
			System.out.println(linked.get(i));
		}
		
		Iterator<String> it = linked.iterator();
		while(it.hasNext()) {
			String valor = it.next();
			System.out.println(valor);
		}
	}
}
