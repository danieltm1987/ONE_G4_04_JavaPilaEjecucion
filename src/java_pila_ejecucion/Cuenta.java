package java_pila_ejecucion;

public class Cuenta {
	
	private int numero;
	private double saldo;
	
	public Cuenta() {
		this.numero =7895625*78;
		this.saldo = 10;
	}
	
	public Cuenta(int agencia, int numero) {
		
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia Invalida !!!");
		}
		
		if(numero < 1) {
			throw new IllegalArgumentException("Numero de Cuenta Invalido !!!");
		}
		
		System.out.println("Cuenta Creada");
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void deposita(double saldo) throws MyException2 {
		this.saldo =saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	

}
