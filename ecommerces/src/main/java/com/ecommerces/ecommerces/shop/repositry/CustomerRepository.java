package com.ecommerces.ecommerces.shop.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerces.ecommerces.shop.entity.Customers;

/**
 * @author DINESH PATEL
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {
	public Customers findByCustomerId(Long customerId);
	public Customers findByCustMobile(String custMobile);
}