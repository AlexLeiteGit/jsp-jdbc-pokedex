package br.com.javacodex.jsp_jdbc_pokedex;

import org.junit.Test;

import dao.DaoSearchPokedex;
import dao.DaoUpdatePokedex;
import model.Pokemom;

public class TestUpdate {

	@Test
	public void updatePokedex() {
	
		try {
			
			DaoSearchPokedex dao1 = new DaoSearchPokedex();
			
			Pokemom pokemomBuscado = dao1.listarPokemom(3L);
			
			pokemomBuscado.setNome("Teste do Método de atualizar");
			
			DaoUpdatePokedex dao2 = new DaoUpdatePokedex();
			
			dao2.atualizarPokedex(pokemomBuscado);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}