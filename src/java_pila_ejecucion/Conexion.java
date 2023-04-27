package java_pila_ejecucion;

public class Conexion implements AutoCloseable {
	
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

	@Override
	public void close() throws Exception {
		cerrar();
		
	}

}
