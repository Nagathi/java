import animais.Cachorro;

public class Main {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		System.out.println(cachorro.getNome());
		cachorro.setNome("Sexo");
		System.out.println(cachorro.getNome());
	}

}
