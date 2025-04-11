package services.impl;

import org.apache.ibatis.session.SqlSession;

import config.MyBatisUtil;
import dao.PedidoMapper;
import models.Pedido;
import services.PedidoService;

public class PedidoServiceImpl implements PedidoService{

	@Override
	public Pedido obtenerPedidoPorCodigoInterno(String codigoInterno) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoMapper pedidoMapper = session.getMapper(PedidoMapper.class);
			return pedidoMapper.obtenerPedidoPorCodigoInterno(codigoInterno);
		} catch (Exception e) {
			System.out.println("obtenerPedidoPorCodigoInterno::"+e);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Pedido insertarPedido(Pedido pedido) {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			PedidoMapper pedidoMapper = session.getMapper(PedidoMapper.class);
			pedidoMapper.insertarPedido(pedido);
			session.commit();
			return pedido;
		} catch (Exception e) {
			System.out.println("insertarPedido::"+e);
			e.printStackTrace();
			return null;
		}
	}
}








