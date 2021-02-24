package model;

public class Pessoa extends Animal {
	private String nome;

	public Pessoa(String n) {
		this.nome = n;
		System.out.println("Construindo Pessoa");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
