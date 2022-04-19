package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionPokedex;
import model.Pokemom;

public class DaoSearchPokedex {

	private Connection connection;

	public DaoSearchPokedex() {
		connection = SingleConnectionPokedex.getConnection();
	}

	public List<Pokemom> listarPokedex() throws Exception {

		List<Pokemom> listaPokemom = new ArrayList<Pokemom>();

		String sqlSearchPokedex = "select * from pokemom";

		PreparedStatement selectPokedex = connection.prepareStatement(sqlSearchPokedex);

		ResultSet resultado = selectPokedex.executeQuery();

		while (resultado.next()) {

			Pokemom pokemom = new Pokemom();
			
			pokemom.setId(resultado.getLong("id"));
			pokemom.setNome(resultado.getString("nome"));
			pokemom.setTipo(resultado.getString("type"));
			pokemom.setHp(resultado.getLong("hp"));

			listaPokemom.add(pokemom);

		}

		return listaPokemom;

	}

	public Pokemom listarPokemom(Long id) throws Exception{
		
		Pokemom pokemom = new Pokemom();
		
		String sqlSearchPokemom = "select * from pokemom where id = " + id;
		
		PreparedStatement selectPokemom = connection.prepareStatement(sqlSearchPokemom);
		
		ResultSet resultado = selectPokemom.executeQuery();
		
		while(resultado.next()) {
			
			pokemom.setId(resultado.getLong("id"));
			pokemom.setNome(resultado.getString("nome"));
			pokemom.setTipo(resultado.getString("type"));
			pokemom.setHp(resultado.getLong("hp"));
			
		}
		
		return pokemom;
	}

}
