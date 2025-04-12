package controllers;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pedido;
import models.PedidoDetalle;
import services.PedidoService;
import services.impl.PedidoDetalleServiceImpl;
import services.impl.PedidoServiceImpl;
import shared.Util;

@WebServlet("/carrito")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PedidoServiceImpl pedidoServiceImpl;
	private PedidoDetalleServiceImpl pedidoDetalleServiceImpl;

    public CarritoServlet() {
        super();
        pedidoServiceImpl = new PedidoServiceImpl();
        pedidoDetalleServiceImpl = new PedidoDetalleServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sessionId = Util.getCookieValue(request.getCookies(), "JSESSIONID");
		Pedido pedido = pedidoServiceImpl.obtenerPedidoPorCodigoInterno(sessionId);
		if (pedido != null) {
			List<PedidoDetalle> detalles = pedidoDetalleServiceImpl.obtenerDetallesPorIdPedido(pedido.getIdPedido());
			request.setAttribute("detallesCarrito", detalles);
		}
		
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
		
		PedidoDetalle pedidoDetalle = pedidoDetalleServiceImpl.obtenerPedidoDetallePorIdPedidoAndIdProducto(pedido.getIdPedido(), idProducto);
		if (pedidoDetalle == null) {
			PedidoDetalle newPedidoDetalle = new PedidoDetalle();
			newPedidoDetalle.setIdPedido(pedido.getIdPedido());
			newPedidoDetalle.setIdProducto(idProducto);
			pedidoDetalle = pedidoDetalleServiceImpl.insertarPedidoDetalle(newPedidoDetalle);
			
		}else {
			pedidoDetalleServiceImpl.aumentarPedidoDetalleCantidad(pedidoDetalle.getIdPedidoDetalle());
		}
		
		System.out.println("PedidoDetalleId::" + pedidoDetalle.getIdPedidoDetalle());
		
		response.getWriter().append("OK");
	}

}













