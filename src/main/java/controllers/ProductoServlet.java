package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productos")
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("METODO GET - Served at: ").append(request.getContextPath());
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("METODO POST - Served at: ").append(request.getContextPath());
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("METODO PUT - Served at: ").append(request.getContextPath());
	}
	
	protected void doPatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("METODO PATCH - Served at: ").append(request.getContextPath());
	}

}
