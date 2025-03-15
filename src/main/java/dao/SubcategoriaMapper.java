package dao;

import java.util.List;
import models.Subcategoria;

public interface SubcategoriaMapper {

	List<Subcategoria> listarSubcategorias(int idCategoria);
}
