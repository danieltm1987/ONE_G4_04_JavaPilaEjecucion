package java_pila_ejecucion;

public class Conexion {
	
	public Conexion() {
		System.out.println("¡¡¡Abriendo Conexion!!!");
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo Datos...");
		throw new IllegalStateException();
	}
	
	public void cerrar() {
		System.out.println("Cerrando Conexion !!!");
	}

}
