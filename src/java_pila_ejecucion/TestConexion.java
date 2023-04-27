package java_pila_ejecucion;

public class TestConexion {

	public static void main(String[] args) {
		
		Conexion con = null;
		
		try {
			con = new Conexion();
			con.leerDatos();			
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo Exception...");
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando Finally");
			if(con!=null) {
				con.cerrar();				
			}
		}
	}

}
