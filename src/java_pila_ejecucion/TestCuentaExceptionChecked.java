package java_pila_ejecucion;

public class TestCuentaExceptionChecked {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MyException2 e) {
			System.out.println("Atrapada");
			e.printStackTrace();
		}

	}

}
