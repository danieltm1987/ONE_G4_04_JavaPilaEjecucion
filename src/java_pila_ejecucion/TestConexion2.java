package java_pila_ejecucion;

public class TestConexion2 {

	public static void main(String[] args) throws Exception {
		/*
		 * Optimizando cierre de conexiones con AutoClosabled
		 * 
		 * */
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch (IllegalStateException e) {
			System.out.println("Ejecutando Catch");
			e.printStackTrace();
		}

	}

}
