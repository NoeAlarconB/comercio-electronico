package dao;

import models.Pedido;

public interface PedidoMapper {
	Pedido obtenerPedidoPorCodigoInterno(String codigoInterno);
	void insertarPedido(Pedido pedido);
	
}
