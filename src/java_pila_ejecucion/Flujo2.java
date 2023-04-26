package java_pila_ejecucion;

public class Flujo2 {

	public static void main(String[] args) {
		
		try {
	        metodo1();
	    }catch(ArithmeticException | NullPointerException | MyException2 ex) {
	    	String msg = ex.getMessage();
	        System.out.println("Exception " + msg);
	        ex.printStackTrace();
	    }
	}
	
	public static void metodo1() throws MyException2 {
		System.out.println("Inicio del metodo1");
	    metodo2();
	    System.out.println("Fin del metodo1");		
	}
	
	public static void metodo2() throws MyException2 {
		System.out.println("Inicio del metodo2");
	    throw new MyException2("Surgió un error");
	    // System.out.println("Fin del metodo2");
	}

}
