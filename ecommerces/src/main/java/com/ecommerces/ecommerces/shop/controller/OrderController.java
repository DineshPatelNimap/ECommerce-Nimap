package com.ecommerces.ecommerces.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerces.ecommerces.shop.entity.Orders;
import com.ecommerces.ecommerces.shop.service.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@RestController
@Slf4j
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/")
	public Orders saveOrders(@RequestBody Orders order) {
		log.info("Order Details Saving");
		return orderService.saveOrders(order);
	}
	
	@GetMapping("/{orderID}")
	public Orders fetchOrderDetailsById(@PathVariable("orderID") Long orderID) {
		log.info("Order Fetching Order ID");
		return orderService.fetchOrderDetailsById(orderID);
	}
	
	@GetMapping("/customer/{customerID}")
	public Orders fetchOrderByCustomerId(@PathVariable("customerID") Long customerID) {
		log.info("Order Fetching Customer ID");
		return orderService.fetchOrderByCustomerId(customerID);
	}
	
	@GetMapping("/orderAll")
	public List<Orders> fetchAllOrderList() {
		log.info("All Order Fetching");
		return orderService.fetchAllOrderList();
	}
	
	@PutMapping("/update/{orderID}")
	public Orders updateOrderByID(@PathVariable("orderID") Long orderID,@RequestBody Orders orders) {
		log.info("Order Updating By Id");
		return orderService.updateByOrderID(orderID,orders);
		
	}
	
	@DeleteMapping("/{orderID}")
	public String deleteByOrderId(@PathVariable("orderID") Long orderID) {
		log.info("Order Deleting By Id");
		return orderService.deleteByOrderId(orderID);
	}
	
}