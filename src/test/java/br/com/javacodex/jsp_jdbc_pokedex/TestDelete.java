package br.com.javacodex.jsp_jdbc_pokedex;

import org.junit.Test;

import dao.DaoDeletePokedex;
import dao.DaoSearchPokedex;
import model.Pokemom;

public class TestDelete {

	@Test
	public void deletarPokedex() {
		
		
		try {
			
			DaoSearchPokedex dao1 = new DaoSearchPokedex();
				
			Pokemom pokemomDeletado = dao1.listarPokemom(3L);
			
			DaoDeletePokedex dao2 = new DaoDeletePokedex();
			
			dao2.deletarPokedex(pokemomDeletado.getId());
		
		} catch (Exception e1) {
				
			e1.printStackTrace();
		}
		
	}

}
