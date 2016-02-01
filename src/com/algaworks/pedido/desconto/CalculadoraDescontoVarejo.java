package com.algaworks.pedido.desconto;

public class CalculadoraDescontoVarejo implements CalculadoraDesconto {

	@Override
	public double calcular(double valor) {
		return valor * 0.05;
	}

}
