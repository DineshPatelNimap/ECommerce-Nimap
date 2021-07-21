package com.ecommerces.ecommerces.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerces.ecommerces.shop.entity.Customers;
import com.ecommerces.ecommerces.shop.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public Customers saveCustomer(@RequestBody Customers cust) {
		log.info("Customer Data Inserted");
		return customerService.saveCustomer(cust);
	}
	
	@GetMapping("/{id}")
	public Customers fetchCustomerDetailsById(@PathVariable("id") Long custId) {
		log.info("Customer Details Fetch By Id");
		return customerService.fetchCustomerById(custId);
	}
	
	@GetMapping("/mobile/{mobile}")
	public Customers fetchCustomerDetailsByMobile(@PathVariable("mobile") String custMobile) {
		log.info("Customer Details Fetch By Mobile");
		return customerService.fetchCustomerDetailsByMobile(custMobile);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomerById(@PathVariable("id") Long custId) {
		log.info("Customer Details Delete By Id");
		return customerService.deleteCustomerById(custId);
	}
	
	@PutMapping("/{id}")
	public Customers updateCustomerById(@PathVariable("id") Long custId, @RequestBody Customers customer) {
		log.info("Customer Update By Id");
		return customerService.updateCustomerById(custId,customer);
	}
}