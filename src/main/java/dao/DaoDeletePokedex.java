package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnectionPokedex;

public class DaoDeletePokedex {

	private Connection connection;

	public DaoDeletePokedex() {
		connection = SingleConnectionPokedex.getConnection();
	}

	public void deletarPokedex(Long id) {

		try {

			String sqlDeletar = "delete from pokemom where id = " + id;

			PreparedStatement deletar = connection.prepareStatement(sqlDeletar);

			deletar.execute();

			connection.commit();

		} catch (Exception e1) {
			
			try {

				connection.rollback();

			} catch (SQLException e2) {

				e2.printStackTrace();

			}

			e1.printStackTrace();
		}

	}
	
	public void deletarDados(Long idPokemom) {
		
		try {
			
			String sqlPoder = "delete from poderes where relacaopokemom = " + idPokemom;
			String sqlPokemom = "delete from pokemom where id = " + idPokemom;
			
			PreparedStatement stmt = connection.prepareStatement(sqlPoder);
			stmt.executeUpdate();
			connection.commit();
			
			stmt = connection.prepareStatement(sqlPokemom);
			stmt.executeUpdate();
			connection.commit();
			
		} catch (Exception e1) {
			
			try {
				
				connection.rollback();
				
			} catch (SQLException e2) {
				
				e2.printStackTrace();
			}
			
			e1.printStackTrace();
		}
		
		System.out.println("Dados Deletados Com SUCESSO!!!!!");
		
	}

}
