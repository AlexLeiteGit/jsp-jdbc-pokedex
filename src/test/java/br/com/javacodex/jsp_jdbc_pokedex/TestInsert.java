package br.com.javacodex.jsp_jdbc_pokedex;

import org.junit.Test;

import dao.DaoInsertPokedex;
import model.Poderes;
import model.Pokemom;

public class TestInsert {

	@Test
	public void incluirPokemom() {
		
		DaoInsertPokedex dao = new DaoInsertPokedex();
		
		Pokemom pokemom = new Pokemom();
		
		pokemom.setNome("VenusaurEX");
		pokemom.setTipo("Plant");
		pokemom.setHp(180L);
		
		dao.insertPokemom(pokemom);
		
	}
	
	@Test
	public void incluirPoder() {
		
		DaoInsertPokedex dao = new DaoInsertPokedex();
		
		Poderes poder = new Poderes();
		
		poder.setPoder1("Poison Potwder");
		poder.setPoder2("Jungle Hammer");
		poder.setPokemomId(7L);
		
		dao.insertPoderes(poder);
		
	}
}
