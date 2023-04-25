package java_pila_ejecucion;

public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio main !!!");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo 1!!!");
		metodo2();
		System.out.println("Fin metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio metodo 1!!!");
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			
			try { // java intenta esto...
				
				if (i == 3) {
					int num = 0;
					int resultado = i/num;
				}
				
				String test = null;
				System.out.println(test.toString());
				
			}catch (ArithmeticException| NullPointerException exception) {
				System.out.println("Atrapo Excepcion");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
		}
		System.out.println("Fin metodo 1");
	}
}
