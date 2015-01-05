package com.chefensaapi.dao;

import javax.sql.DataSource;

import com.chefensaapi.models.Customer;

public interface CustomerDao {

	public void setDataSOurce(DataSource dataSource);
	public int create(Customer customer);
	public Customer getCustomerInfo(long customerId);
}
