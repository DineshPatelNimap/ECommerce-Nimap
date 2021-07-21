package com.ecommerces.ecommerces.shop.service.impl;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerces.ecommerces.shop.entity.Orders;
import com.ecommerces.ecommerces.shop.repositry.OrdersRepository;
import com.ecommerces.ecommerces.shop.service.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrdersRepository orderRepository;

	@Override
	public Orders saveOrders(Orders order) {
		log.info("Order Saved");
		return orderRepository.save(order);
	}

	@Override
	public List<Orders> fetchAllOrderList() {
		log.info("All Order fetch By Id");
		return orderRepository.findAll();
	}

	@Override
	public Orders fetchOrderDetailsById(Long orderID) {
		log.info("Order fetch By Id");
		return orderRepository.findByOrderID(orderID);
	}
	
	@Override
	public Orders fetchOrderByCustomerId(Long customerId) {
		log.info("Order fetch By CustomerId");
		return orderRepository.findByCustomerId(customerId);
	}

	@Override
	public Orders updateByOrderID(Long orderID, Orders orders) {
		log.info("Order Updated By Id "+orderID);
		Orders or=fetchOrderDetailsById(orderID);
		
		if(Objects.nonNull(orders.getProductID())){
			log.info("Order Updated ProductId");
			or.setProductID(orders.getProductID());
		}
		if(Objects.nonNull(orders.getProdPrice()) && !"".equalsIgnoreCase(orders.getProdPrice())) {
			log.info("Order Updated ProductPrice");
			or.setProdPrice(orders.getProdPrice());
		}
		if(Objects.nonNull(orders.getOrderQuantity()) && !"".equalsIgnoreCase(orders.getOrderQuantity())) {
			log.info("Order Updated Quantity");
			or.setOrderQuantity(orders.getOrderQuantity());
		}
		if(Objects.nonNull(orders.getOrderAmount()) && !"".equalsIgnoreCase(orders.getOrderAmount())) {
			log.info("Order Updated Amount");
			or.setOrderAmount(orders.getOrderAmount());
		}
						
		log.info("Order Updated Successfuly !!");
		return orderRepository.save(or);
	}

	@Override
	public String deleteByOrderId(Long orderID) {
		log.info("Order Deleted By Id");
		orderRepository.deleteById(orderID);
		return "Order is Deleted !!";
	}
}