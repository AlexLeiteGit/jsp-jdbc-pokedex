package model;

public class BeanPokemomPoderes {
	
	private String nome;
	private String type;
	private Long hp;
	private String poder1;
	private String poder2;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Long getHp() {
		return hp;
	}
	
	public void setHp(Long hp) {
		this.hp = hp;
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

	@Override
	public String toString() {
		return "POKEMOM => nome: " + nome + ", type: " + type + ", hp: " + hp + ", poder1: = " + poder2;
	}
}
