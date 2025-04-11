package models;

import java.sql.Date;

public class PedidoDetalle {
	private Integer idPedidoDetalle;
	private Integer idPedido;
	private Integer idProducto;
	private Integer cantidad;
	private Float precioUnitario;
	private Float subtotal;
	private Date fechaCreacion;
	
	public Integer getIdPedidoDetalle() {
		return idPedidoDetalle;
	}
	public void setIdPedidoDetalle(Integer idPedidoDetalle) {
		this.idPedidoDetalle = idPedidoDetalle;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
