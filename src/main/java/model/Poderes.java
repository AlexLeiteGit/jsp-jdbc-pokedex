package model;

public class Poderes {
	
	private Long id;
	private String poder1;
	private String poder2;
	private Long pokemomId;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPoder1() {
		return poder1;
	}
	
	public void setPoder1(String poder1) {
		this.poder1 = poder1;
	}
	
	public String getPoder2() {
		return poder2;
	}
	
	public void setPoder2(String poder2) {
		this.poder2 = poder2;
	}

	public Long getPokemomId() {
		return pokemomId;
	}

	public void setPokemomId(Long pokemomId) {
		this.pokemomId = pokemomId;
	}

	@Override
	public String toString() {
		return "Poderes - id: " + id + ", poder1: " + poder1 + ", poder2: " + poder2;
	}
}
