package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionPokedex {
	
	private static String banco = "jdbc:postgresql://localhost:5433/pokedex?autoreconnect=true";
	private static String usuario = "postgres";
	private static String password = "admin";
	
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnectionPokedex() {
		conectar();
	}
	
	
	public static void conectar() {
		
		try {
			
			if(connection == null) {
				
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, usuario, password);
				connection.setAutoCommit(false);
				
				System.out.println("POKEDEX ativada com SUCESSO!!!");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	

}
