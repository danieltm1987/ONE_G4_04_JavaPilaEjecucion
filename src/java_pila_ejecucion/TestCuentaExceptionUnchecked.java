package java_pila_ejecucion;

public class TestCuentaExceptionUnchecked {

	public static void main(String[] args) {
		
		try{
			Cuenta cuenta = new Cuenta(10, 1000);
			
			try {
				cuenta.deposita(100000);
			} catch (MyException2 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Mi saldo es :"+cuenta.getSaldo());
			
		}catch (IllegalArgumentException e) {
			System.out.println("Entrando al catch");
			e.printStackTrace();
		}
		
		
		
		

	}

}
