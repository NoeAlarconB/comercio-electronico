package services;

import java.util.List;

import models.Categoria;
import models.Marca;

public interface MarcaService {

	List<Marca> listarMarcas();
	void insertMarca(Categoria categoria);
}
