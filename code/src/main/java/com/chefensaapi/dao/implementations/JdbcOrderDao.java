package com.chefensaapi.dao.implementations;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chefensaapi.dao.OrderDao;
import com.chefensaapi.models.Order;

public class JdbcOrderDao implements OrderDao {


	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public final String ORDER_ID="orderId";
	public final String CUSTOMER_ID="customerId";
	public final String CUSTOMER_NAME="customerName";
	public final String ORDER_ADDRESS="orderAddress";
	public final String ORDER_PHONE="orderPhone";
	public final String CHEF_ID="chefId";
	public final String ORDER_COST="orderCost";
	public final String ORDER_TIME="orderTime";
	
	public final String INSERT_SQL = "insert into Order ( " + 
			CUSTOMER_ID + " , " +
			CUSTOMER_NAME + " , " +
			ORDER_ADDRESS + " , " +
			ORDER_PHONE + " , " +
			CHEF_ID + " , " +
			ORDER_COST + " , " +
			ORDER_TIME + " ) " +
			"values into (?, ? , ? , ? , ? , ? , ?)";
	
	public void setDataSOurce(DataSource dataSource) {
		this.dataSource = dataSource;	
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int createOrder(Order order) {
		Object[] params = new Object[]{
				order.getCustomerId(),
				order.getCustomerName(),
				order.getOrderAddress(),
				order.getOrderPhone(),
				order.getChefId(),
				order.getOrderCost(),
				order.getOrderTime()
		};
		int response = jdbcTemplate.update(INSERT_SQL, params);
		return response;
	}

}
