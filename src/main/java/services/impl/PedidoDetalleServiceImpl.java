package services.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import config.MyBatisUtil;
import dao.PedidoDetalleMapper;
import dao.PedidoMapper;
import models.PedidoDetalle;
import services.PedidoDetalleService;

public class PedidoDetalleServiceImpl implements PedidoDetalleService{

	@Override
	public PedidoDetalle obtenerPedidoDetallePorIdPedidoAndIdProducto(Integer idPedido, Integer idProducto) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoDetalleMapper pedidoDetalleMapper = session.getMapper(PedidoDetalleMapper.class);
			return pedidoDetalleMapper.obtenerPedidoDetallePorIdPedidoAndIdProducto(idPedido, idProducto);
		} catch (Exception e) {
			System.out.println("obtenerPedidoDetallePorIdPedidoAndIdProducto::"+e);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public PedidoDetalle insertarPedidoDetalle(PedidoDetalle pedidoDetalle) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoDetalleMapper pedidoDetalleMapper = session.getMapper(PedidoDetalleMapper.class);
			pedidoDetalleMapper.insertarPedidoDetalle(pedidoDetalle);
			session.commit();
			return pedidoDetalle;
		} catch (Exception e) {
			System.out.println("insertarPedidoDetalle::"+e);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void aumentarPedidoDetalleCantidad(Integer idPedidoDetalle) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoDetalleMapper pedidoDetalleMapper = session.getMapper(PedidoDetalleMapper.class);
			pedidoDetalleMapper.aumentarPedidoDetalleCantidad(idPedidoDetalle);
			session.commit();
		} catch (Exception e) {
			System.out.println("aumentarPedidoDetalleCantidad::"+e);
			e.printStackTrace();
		}
	}

	@Override
	public List<PedidoDetalle> obtenerDetallesPorIdPedido(Integer idPedido) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoDetalleMapper mapper = session.getMapper(PedidoDetalleMapper.class);
			return mapper.obtenerDetallesPorIdPedido(idPedido);
		} catch (Exception e) {
			System.out.println("obtenerDetallesPorIdPedido::"+e);
			e.printStackTrace();
			return null;
		}
	}
}










