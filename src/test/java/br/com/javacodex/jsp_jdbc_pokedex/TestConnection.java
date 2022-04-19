package br.com.javacodex.jsp_jdbc_pokedex;

import org.junit.Test;

import connection.SingleConnectionPokedex;

public class TestConnection {

    @Test
    public void iniciarPokedex() {
    	SingleConnectionPokedex.getConnection();
    }
}
