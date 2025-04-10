package dao;

import java.util.List;
import models.Producto;

public interface ProductoMapper {
	List<Producto> listarProductosPorIdSubcategoria(Integer idSubcategoria);
	Producto obtenerDetalleProductoPorIdProducto(Integer idProducto);
	List<String> obtenerImagenesPorIdProducto(Integer idProducto);
}
