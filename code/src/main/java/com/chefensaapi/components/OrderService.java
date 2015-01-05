package com.chefensaapi.components;

import org.springframework.stereotype.Component;

import com.chefensaapi.components.interfaces.IOrderService;
import com.chefensaapi.dao.implementations.JdbcOrderDao;
import com.chefensaapi.models.Order;

@Component
public class OrderService implements IOrderService {

	public int createOrder(Order order) {
		JdbcOrderDao jdbcOrderDao= new JdbcOrderDao();
		int response = jdbcOrderDao.createOrder(order);
		return response;
	}
}
