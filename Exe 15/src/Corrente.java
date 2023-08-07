
public class Corrente extends Conta{
	private float limite;
	
	boolean pVez = true;
	

	public Corrente(float limite) {
		
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float getSaldo() {
		
		if(pVez) {
			float somaSaldo = saldo + limite;
			
			try {
				float cpmf = (saldo + limite) * 0.0038f;
				saldo = somaSaldo - cpmf;
				pVez = false;
			}catch(Exception e) {
				
			}	
		}
		
		return saldo;
	}

}