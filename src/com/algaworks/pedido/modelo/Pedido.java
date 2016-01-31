package com.algaworks.pedido.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Long numero;
	private  LocalDate dataCriação;
	private String observacao;
	private double valorFrete;
	private double valorDesconto;
	private double valorTotal;
	
	private Cliente cliente;
	private List<ItemPedido> itens;

	public Pedido(Long numero,  String observacao, double valorFrete, double valorDesconto,
			double valorTotal) {
		super();
		this.numero = numero;
		this.dataCriação = LocalDate.now();
		this.observacao = observacao;
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.valorTotal = valorTotal;
	}

	
	@Override
	public String toString() {
		return "Pedido: numero=" + numero + ", dataCriação=" + dataCriação + ", observacao=" + observacao
				+ ", valorFrete=" + valorFrete + ", valorDesconto=" + valorDesconto + ", valorTotal=" + valorTotal
				+ ", cliente=" + cliente + ", itens=" + itens;
	}

	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void adicionarItem(ItemPedido item){
		if (itens == null) {
			
			itens = new ArrayList<ItemPedido>();
		}
		itens.add(item);
	}
	
	public Integer totalItens(){
		return itens == null ? 0 : itens.size();
	}
}






