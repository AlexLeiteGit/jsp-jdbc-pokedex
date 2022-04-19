package br.com.javacodex.jsp_jdbc_pokedex;

import org.junit.Test;

import dao.DaoDeletePokedex;

public class TestDeleteDado {

	@Test
	public void testeDeletePokemomPoder() {
		
		DaoDeletePokedex dao = new DaoDeletePokedex();
		
		dao.deletarDados(1L);
		
	}

}
