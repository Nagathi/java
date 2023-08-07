
public class Pessoa {
	private String nome;
	private String tel;
	
	public Pessoa(String nome, String tel) {
		this.setNome(nome);
		this.setTel(tel);
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
