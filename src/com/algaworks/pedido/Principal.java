package com.algaworks.pedido;

import com.algaworks.pedido.modelo.Cliente;
import com.algaworks.pedido.modelo.ItemPedido;
import com.algaworks.pedido.modelo.Pedido;

public class Principal {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1L, "Urgente", 50.0,10.5, 164.4 );
		
		//Pedido p2 = new Pedido(2L, "Urgente", 50.0,10.5, 164.4 );
		
		Cliente cliente= new Cliente("João Antonio", "joaoant@hotmail.com", "9999-8888");
		pedido.setCliente(cliente);
		
		ItemPedido geladeira = new ItemPedido(1, 1500, "Duplex");
		pedido.adicionarItem(geladeira);
		
		System.out.println(pedido);
		//System.out.println();
		//System.out.println(p2);
	}

}
