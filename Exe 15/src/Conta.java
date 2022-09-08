
public abstract class Conta {
	
	protected float saldo;
	
	public Conta() {
		this.setSaldo(0);
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float valor) {
		this.saldo = 0;
		this.saldo += valor;
	}
}