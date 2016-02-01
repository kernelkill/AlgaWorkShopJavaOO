package com.algaworks.pedido.modelo;

public class ItemPedido {
	
	private Integer quantidade;
	private double valorUnitario;
	private String produto;
	
	
	public ItemPedido(Integer quantidade, double valorUnitario, String produto) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return "ItemPedido [quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", produto=" + produto
				+ "]";
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
