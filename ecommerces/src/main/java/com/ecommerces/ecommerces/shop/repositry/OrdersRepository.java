package com.ecommerces.ecommerces.shop.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerces.ecommerces.shop.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
