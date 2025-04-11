package controllers;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pedido;
import services.PedidoService;
import services.impl.PedidoServiceImpl;
import shared.Util;

@WebServlet("/carrito")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PedidoServiceImpl pedidoServiceImpl;

    public CarritoServlet() {
        super();
        pedidoServiceImpl = new PedidoServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/carrito.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer idProducto = Integer.parseInt(request.getParameter("idProducto"));
		System.out.println("Se esta agregando un elemento al carrito:" + idProducto);
		
		String sessionId = Util.getCookieValue(request.getCookies(), "JSESSIONID");
		
		Pedido pedido = pedidoServiceImpl.obtenerPedidoPorCodigoInterno(sessionId); //busco la venta
		if(pedido==null) { //si no existe lo inserto
			Pedido newpedido = new Pedido();
			newpedido.setCodigoInterno(sessionId);
			pedido = pedidoServiceImpl.insertarPedido(newpedido); // escribo el nuevo objeto insertado
		}
		
		System.out.println("PedidoId::" + pedido.getIdPedido());
		
		response.getWriter().append("OK");
	}

}













