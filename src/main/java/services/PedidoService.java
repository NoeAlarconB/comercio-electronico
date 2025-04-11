package services;

import models.Pedido;

public interface PedidoService {
	Pedido obtenerPedidoPorCodigoInterno(String codigoInterno);
	Pedido insertarPedido(Pedido pedido);
}
