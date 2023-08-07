import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escola o funcionamento de fila(1) ou pilha(2)");
		String op = sc.next();
		
		if(op.equals("1")) {
			Queue<String> fila = new LinkedList<>();
			
			fila.offer("Elemento 1");
	        fila.offer("Elemento 2");
	        fila.offer("Elemento 3");
	        
	        String elementoFrente = fila.peek();
	        System.out.println("Elemento na frente da fila: " + elementoFrente);

	        String elementoRemovido = fila.poll();
	        System.out.println("Elemento removido: " + elementoRemovido);

	        elementoFrente = fila.peek();
	        System.out.println("Elemento na frente da fila após a remoção: " + elementoFrente);
		}else if(op.equals("2")) {
			Deque<String> pilha = new LinkedList<>();

	        pilha.push("Elemento 1");
	        pilha.push("Elemento 2");
	        pilha.push("Elemento 3");

	        String elementoTopo = pilha.peek();
	        System.out.println("Elemento no topo da pilha: " + elementoTopo);

	        String elementoRemovido = pilha.pop();
	        System.out.println("Elemento removido: " + elementoRemovido);

	        elementoTopo = pilha.peek();
	        System.out.println("Elemento no topo da pilha após a remoção: " + elementoTopo);
		}
	}
}
