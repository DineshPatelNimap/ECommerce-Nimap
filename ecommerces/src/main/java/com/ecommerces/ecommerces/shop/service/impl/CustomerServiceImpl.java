package com.ecommerces.ecommerces.shop.service.impl;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerces.ecommerces.shop.entity.Customers;
import com.ecommerces.ecommerces.shop.repositry.CustomerRepository;
import com.ecommerces.ecommerces.shop.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository custRepository;

	@Override
	public Customers fetchCustomerById(Long customerId) {
		log.info("Customer Find By Id");
		return custRepository.findByCustomerId(customerId);
	}

	@Override
	public Customers saveCustomer(Customers cust) {
		log.info("Customer Saved");
		return custRepository.save(cust);
	}

	@Override
	public String deleteCustomerById(Long custId) {
		log.info("Customer Deleted");
		custRepository.deleteById(custId);
		return "Customer Is Deleted";
	}

	@Override
	public Customers updateCustomerById(Long custId,Customers customer) {
		log.info("Customer ID on updateCustomerById() "+custId);
		Customers cust=fetchCustomerById(custId);
		
		if (Objects.nonNull(customer.getCustFirstName()) && !"".equalsIgnoreCase(customer.getCustFirstName())) {
			log.info("Customer FirstName on updateCustomerById() "+customer.getCustFirstName());
			cust.setCustFirstName(customer.getCustFirstName());
		}

		if (Objects.nonNull(customer.getCustLastName()) && !"".equalsIgnoreCase(customer.getCustLastName())) {
			log.info("Customer LastName on updateCustomerById() "+customer.getCustLastName());
			cust.setCustLastName(customer.getCustLastName());
		}

		if (Objects.nonNull(customer.getCustEmail()) && !"".equalsIgnoreCase(customer.getCustEmail())) {
			log.info("Customer Email on updateCustomerById() "+customer.getCustEmail());
			cust.setCustEmail(customer.getCustEmail());
		}

		if (Objects.nonNull(customer.getCustMobile()) && !"".equalsIgnoreCase(customer.getCustMobile())) {
			log.info("Customer Mobile on updateCustomerById() "+customer.getCustMobile());
			cust.setCustMobile(customer.getCustMobile());
		}

		if (Objects.nonNull(customer.getCustAlternateMobile()) && !"".equalsIgnoreCase(customer.getCustAlternateMobile())) {
			log.info("Customer AlternateMobile on updateCustomerById() "+customer.getCustAlternateMobile());
			cust.setCustAlternateMobile(customer.getCustAlternateMobile());
		}

		if (Objects.nonNull(customer.getCustAddress()) && !"".equalsIgnoreCase(customer.getCustAddress())) {
			log.info("Customer Address on updateCustomerById() "+customer.getCustAddress());
			cust.setCustAddress(customer.getCustAddress());
		}
		log.info("Customer is Updated");
		return custRepository.save(cust);
	}

	@Override
	public Customers fetchCustomerDetailsByMobile(String custMobile) {
		log.info("Customer Details Fetch By Mobile");
		return custRepository.findByCustMobile(custMobile);
	}
	

}
