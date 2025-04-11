package dao;

import org.apache.ibatis.annotations.Param;

import models.PedidoDetalle;

public interface PedidoDetalleMapper {
	PedidoDetalle obtenerPedidoDetallePorIdPedidoAndIdProducto(@Param("idPedido") Integer idPedido, @Param("idProducto") Integer idProducto);
	void insertarPedidoDetalle(PedidoDetalle pedidoDetalle);
	void aumentarPedidoDetalleCantidad(Integer idPedidoDetalle);
}
