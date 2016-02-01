package com.algaworks.pedido.modelo;

import com.algaworks.pedido.desconto.CalculadoraDesconto;
import com.algaworks.pedido.desconto.CalculadoraDescontoAtacado;
import com.algaworks.pedido.desconto.CalculadoraDescontoVarejo;

public enum TipoPedido {
	
	ATACADO{
		@Override
		public CalculadoraDesconto calculadora() {
			return new CalculadoraDescontoAtacado();
		}
	},
	VAREJO{
		@Override
		public  CalculadoraDesconto calculadora(){
			return new CalculadoraDescontoVarejo();
		}
	};
	public abstract CalculadoraDesconto calculadora();
}
