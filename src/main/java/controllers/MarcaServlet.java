package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Marca;
import services.MarcaService;
import services.impl.MarcaServiceImpl;

@WebServlet("/marcas")
public class MarcaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final MarcaService marcaService;

    public MarcaServlet() {
        super();
        marcaService = new MarcaServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Marca> marca = marcaService.listarMarcas();
		request.setAttribute("marcas", marca);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/marcas.jsp");
		dispatcher.forward(request, response);
	}
}









