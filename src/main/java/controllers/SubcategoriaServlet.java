package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Subcategoria;
import services.SubcategoriaService;
import services.impl.SubcategoriaServiceImpl;

@WebServlet("/subcategorias")
public class SubcategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final SubcategoriaService subcategoriaService;

    public SubcategoriaServlet() {
        super();
        subcategoriaService = new SubcategoriaServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
		List<Subcategoria> subcategorias = subcategoriaService.listarSubcategorias(idCategoria);
		request.setAttribute("subcategorias", subcategorias);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/categorias.jsp");
		dispatcher.forward(request, response); 
	}

}
