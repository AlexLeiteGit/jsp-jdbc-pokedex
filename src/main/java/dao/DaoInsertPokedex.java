package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnectionPokedex;
import model.Poderes;
import model.Pokemom;

public class DaoInsertPokedex {
	
	private Connection connection;

	public DaoInsertPokedex() {
		connection = SingleConnectionPokedex.getConnection();
	}
	
	public void insertPokemom(Pokemom pokemom) {

		try {
			
			String sqlPokemom = "insert into pokemom (nome, type, hp) values(?,?,?)";
			
			PreparedStatement stmtPokemom = connection.prepareStatement(sqlPokemom);
			
			stmtPokemom.setString(1, pokemom.getNome());
			stmtPokemom.setString(2, pokemom.getTipo());
			stmtPokemom.setLong(3, pokemom.getHp());
			
			stmtPokemom.execute();
			
			connection.commit();
			
		} catch (Exception e) {
			try {
				
				connection.rollback();
			
			} catch (SQLException e2) {
				
				e2.printStackTrace();
			
			}
			e.printStackTrace();
		}	
	}
	
	public void insertPoderes(Poderes poder) {
		
		try {
			
			String sqlPoderes = "insert into poderes (poder1, poder2, relacaopokemom) values(?,?,?)";
			
			PreparedStatement stmtPoderes = connection.prepareStatement(sqlPoderes);
			
			stmtPoderes.setString(1, poder.getPoder1());
			stmtPoderes.setString(2, poder.getPoder2());
			stmtPoderes.setLong(3, poder.getPokemomId());
			
			stmtPoderes.execute();
			
			connection.commit();
			
		} catch (Exception e) {
			try {
				
				connection.rollback();
				
			} catch (SQLException e2) {
				
				e2.printStackTrace();
				
			}
			
			e.printStackTrace();
		}
	}
}
