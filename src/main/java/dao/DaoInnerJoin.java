package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionPokedex;
import model.BeanPokemomPoderes;

public class DaoInnerJoin {

	private Connection connection;

	public DaoInnerJoin() {
		connection = SingleConnectionPokedex.getConnection();
	}

	public List<BeanPokemomPoderes> listaPokemomPoderes(Long idPokemom) {

		List<BeanPokemomPoderes> listaPokemom = new ArrayList<BeanPokemomPoderes>();

		String sql = " select * from pokemom as poke ";
		sql += " inner join poderes as power ";
		sql += " on power.relacaopokemom = poke.id ";
		sql += " where poke.id = " + idPokemom;

		try {

			PreparedStatement innerJoin = connection.prepareStatement(sql);

			ResultSet resultado = innerJoin.executeQuery();

			while (resultado.next()) {

				BeanPokemomPoderes pokemomPoderes = new BeanPokemomPoderes();
				pokemomPoderes.setNome(resultado.getString("nome"));
				pokemomPoderes.setType(resultado.getString("type"));
				pokemomPoderes.setHp(resultado.getLong("hp"));
				pokemomPoderes.setPoder1(resultado.getString("poder1"));
				pokemomPoderes.setPoder2(resultado.getString("poder2"));
				
				listaPokemom.add(pokemomPoderes);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return listaPokemom;

	}
}
