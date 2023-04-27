package java_pila_ejecucion;

public class TestConexion {

	public static void main(String[] args) {
		
		Conexion con = new Conexion();
		try {
			con.leerDatos();			
		} catch (Exception e) {
			System.out.println("Recibiendo Exception...");
			e.printStackTrace();
		} finally {
			System.out.println("Ejecutando Finally");
			con.cerrar();
		}
				
		

	}

}
