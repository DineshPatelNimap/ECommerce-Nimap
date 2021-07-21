package com.ecommerces.ecommerces.shop.service;

import com.ecommerces.ecommerces.shop.entity.Customers;

/**
 * @author DINESH PATEL
 *
 */
public interface CustomerService {
	public Customers saveCustomer(Customers cust);
	public Customers fetchCustomerById(Long customerId);
	public String    deleteCustomerById(Long custId);
	public Customers updateCustomerById(Long custId, Customers customer);
	public Customers fetchCustomerDetailsByMobile(String custMobile);
	
	
}