
public class Cuenta {
	private int numeroCuenta; 
	private double saldo;
	
	public Cuenta(int numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void ingresarDinero(double Cantidad) {
		saldo += Cantidad;
	}
	
	public void retirarDinero(double Cantidad) {
		saldo -= Cantidad;
	}
	
	
}
