package models;

import java.sql.Date;

public class Producto {
	private Integer idProducto;
	private Integer idMarca;
	private Integer idSubcategoria;
	private String nombre;
	private String descripcion;
	private String modelo;
	private Float precio;
	private Integer stock;
	private String estado;
	private Integer fechaGarantiaMeses;
	private Date fechaCreacion;
	private String imagenUrl;
	private String nombreMarca;
	private String imagenUrlMarca;
	
	
	
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public String getImagenUrlMarca() {
		return imagenUrlMarca;
	}
	public void setImagenUrlMarca(String imagenUrlMarca) {
		this.imagenUrlMarca = imagenUrlMarca;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public Integer getIdSubcategoria() {
		return idSubcategoria;
	}
	public void setIdSubcategoria(Integer idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getFechaGarantiaMeses() {
		return fechaGarantiaMeses;
	}
	public void setFechaGarantiaMeses(Integer fechaGarantiaMeses) {
		this.fechaGarantiaMeses = fechaGarantiaMeses;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
