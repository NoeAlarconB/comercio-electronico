package services;

import java.util.List;

import models.PedidoDetalle;

public interface PedidoDetalleService {
	PedidoDetalle obtenerPedidoDetallePorIdPedidoAndIdProducto(Integer idPedido, Integer idProducto);
	PedidoDetalle insertarPedidoDetalle(PedidoDetalle pedidoDetalle);
	void aumentarPedidoDetalleCantidad(Integer idPedidoDetalle);
	List<PedidoDetalle> obtenerDetallesPorIdPedido(Integer idPedido);

}
