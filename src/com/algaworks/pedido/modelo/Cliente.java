package com.algaworks.pedido.modelo;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente: nome=" + nome + ", email=" + email + ", telefone=" + telefone ;
	}
	
}
