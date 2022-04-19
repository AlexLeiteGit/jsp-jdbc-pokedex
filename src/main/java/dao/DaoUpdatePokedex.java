package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnectionPokedex;
import model.Pokemom;

public class DaoUpdatePokedex {

	private Connection connection;

	public DaoUpdatePokedex() {
		connection = SingleConnectionPokedex.getConnection();
	}

	public void atualizarPokedex(Pokemom pokemom) {

		try {

			String sqlUpdate = "update pokemom set nome = ? where id = " + pokemom.getId();
			
			PreparedStatement updatePokedex = connection.prepareStatement(sqlUpdate);
			
			updatePokedex.setString(1, pokemom.getNome());
			
			updatePokedex.execute();
			
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
}
