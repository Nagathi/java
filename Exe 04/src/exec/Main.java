package exec;

public class Main {
	public static void main(String[] args) {
		String s1 = "Gustavo";
		String s2 = new String();
		s2 = "GUSTAVO";
		
		if(s1.equals(s2)) {
			System.out.println("As strings são exatamente iguais");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("As strings são iguais em letras");
		}
	}
}
