package com.chefensaapi.components;

import org.springframework.stereotype.Component;

import com.chefensaapi.components.interfaces.ICustomerService;
import com.chefensaapi.dao.implementations.JdbcCustomerDao;
import com.chefensaapi.models.Customer;

@Component
public class CustomerService implements ICustomerService {

	public Customer getCustomerCompleteDetail(long customerId) {
		Customer customer = new Customer();
		JdbcCustomerDao customerDao= new JdbcCustomerDao();
		customer= customerDao.getCustomerInfo(customerId);
		return customer;
	}

	public int createCustomerEntry(Customer entity) {
		JdbcCustomerDao customerDao= new JdbcCustomerDao();
		customerDao.create(entity);
		return 0;
	}

	public int updateRecentAddress(long customerId ,String address, long phoneNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
