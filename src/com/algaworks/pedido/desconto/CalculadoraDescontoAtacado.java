package com.algaworks.pedido.desconto;

public class CalculadoraDescontoAtacado  implements CalculadoraDesconto{

	@Override
	public double calcular(double valor) {
		return  valor * 0.15;
	}

}
