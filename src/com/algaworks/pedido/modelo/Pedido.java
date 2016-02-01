package com.algaworks.pedido.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.pedido.desconto.CalculadoraDesconto;
import com.algaworks.pedido.desconto.CalculadoraDescontoAtacado;
import com.algaworks.pedido.desconto.CalculadoraDescontoVarejo;

public class Pedido {
	
	private Long numero;
	private  LocalDate dataCriação;
	private String observacao;
	private double valorFrete;
	private double valorTotal;
	private TipoPedido tipo;
	
	private Cliente cliente;
	private List<ItemPedido> itens;
	

	public Pedido(Long numero,  double valorFrete, double valorDesconto,
			 TipoPedido tipo) {
		super();
		this.numero = numero;
		this.dataCriação = LocalDate.now();
		this.valorFrete = valorFrete;
		this.tipo =  tipo;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataCriação=" + dataCriação + ", observacao=" + observacao
				+ ", valorFrete=" + valorFrete + ", tipo=" + tipo + ", cliente="
				+ cliente + ", itens=" + itens + "]";
	}

	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void adicionarItem(ItemPedido item){
		if (itens == null) {
			
			itens = new ArrayList<ItemPedido>();
		}
		itens.add(item);
		recalcularValorTotal();
	}
	
	public Integer totalItens(){
		return itens == null ? 0 : itens.size();
	}
	
	private void recalcularValorTotal(){
		valorTotal =  itens.stream()
									.mapToDouble(i -> i.getValorUnitario() * i.getQuantidade())
									.sum();
	}
	
	public Integer recalcularTotalItens(){
		return itens.stream()
						.mapToInt(i -> i.getQuantidade())
						.sum();
	}
	
	public double calcularDesconto(){
		CalculadoraDesconto calculadoraDesconto = tipo.calculadora();
		return calculadoraDesconto.calcular(valorTotal);
		
	}
}
