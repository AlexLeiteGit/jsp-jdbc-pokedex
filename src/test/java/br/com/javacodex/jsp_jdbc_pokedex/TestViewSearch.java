package br.com.javacodex.jsp_jdbc_pokedex;

import java.util.List;

import org.junit.Test;

import dao.DaoSearchPokedex;
import model.Pokemom;

public class TestViewSearch {

	@Test
	public void listasrPokedex() {
		
		DaoSearchPokedex dao = new DaoSearchPokedex();
		
		try {
			
			List<Pokemom> lista = dao.listarPokedex();
			
			for (Pokemom pokemom : lista) {
				
				System.out.println(pokemom);
				System.out.println("-------------------------------------------------------------------------");
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
	}
	
	@Test
	public void listarPokemom() {
		
		try {
			
			DaoSearchPokedex dao = new DaoSearchPokedex();
			
			
			Pokemom pokemom = dao.listarPokemom(3L);
			
			System.out.println(pokemom);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
