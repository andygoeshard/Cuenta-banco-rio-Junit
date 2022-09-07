package cuenta;

public class Cuenta {

	
	private Double saldo;

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo ;
		
	}

	public void depositar(Double valor) {
		
		if(valor > 0) {
			
			this.saldo += valor;
			
		}
		
	}

	public Boolean extraer(Double monto) {
		
		if(monto > 0 && monto<=this.saldo) {
			
			this.saldo -= monto;
			return true;
		}
		
		return false;
		
	}

	public void tranferir(Cuenta cuentaDestino, Double monto) {
		
		if(extraer(monto)) {
			
			cuentaDestino.depositar(monto);
			
		}
		
	}



}
