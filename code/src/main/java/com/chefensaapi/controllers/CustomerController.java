	package com.chefensaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.chefensaapi.components.interfaces.ICustomerService;
import com.chefensaapi.models.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(value = "/customerInfo")
	public Customer getCustomerDetails(@RequestParam(value="id",required=false,defaultValue="-1") long customerId){
		Customer customer = new Customer();
		customer.setCustomerId(2);
		customer.setCustomerName("AMit");
		customer.setPrimaryAddress("harsh");
		//customer = customerService.getCustomerCompleteDetail(customerId);
		return customer;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
    public int create(@RequestBody final Customer entity) {
		return customerService.createCustomerEntry(entity);
    }
}
