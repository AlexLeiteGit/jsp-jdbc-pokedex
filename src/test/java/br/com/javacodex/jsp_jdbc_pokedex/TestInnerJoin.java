package br.com.javacodex.jsp_jdbc_pokedex;

import java.util.List;

import org.junit.Test;

import dao.DaoInnerJoin;
import model.BeanPokemomPoderes;

public class TestInnerJoin {

	@Test
	public void testeInnerJoinPokedex() {
		
		DaoInnerJoin dao = new DaoInnerJoin();
		
		List<BeanPokemomPoderes> bean = dao.listaPokemomPoderes(6L);
		
		for (BeanPokemomPoderes beanPokemomPoderes : bean) {
			
			System.out.println(beanPokemomPoderes);
			
		}
		
	}

}
