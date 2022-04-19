package model;

public class Pokemom {
	
	private Long id;
	private String nome;
	private String tipo;
	private Long hp;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Long getHp() {
		return hp;
	}
	
	public void setHp(Long hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Pokemom - Id: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", HP: " + hp;
	}
}
