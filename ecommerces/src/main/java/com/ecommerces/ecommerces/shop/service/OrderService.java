package com.ecommerces.ecommerces.shop.service;

import java.util.List;
import com.ecommerces.ecommerces.shop.entity.Orders;
/**
 * @author DINESH PATEL
 *
 */
public interface OrderService {
	public Orders saveOrders(Orders order);
	public Orders fetchOrderDetailsById(Long orderID);
	public Orders fetchOrderByCustomerId(Long customerID);
	public List<Orders> fetchAllOrderList();
	public Orders updateByOrderID(Long orderID, Orders orders);
	public String deleteByOrderId(Long orderID);
}