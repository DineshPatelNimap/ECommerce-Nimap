package com.ecommerces.ecommerces.shop.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DINESH PATEL
 *
 */
@Entity
@Table(name = "OrderDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDetails {
	
	@Id
	@Column(name = "order_details_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String orderDetailsId;
	
	@Column(name = "order_id")
	private String  orderID;
	
	@Column(name = "prod_id")
	private String  productID;
	
	@Column(name = "prod_price")
	private String  prodPrice;
	
	@Column(name = "order_quantity")
	private String orderQuantity;
	
	@Column(name = "order_amount")
	private String orderAmount;
	
	@Column(name = "created_on")
	private Date  custCreatedOn;
	
	@Column(name = "created_by")
	private String  custCreatedBy;    
	
	@Column(name = "updated_on")
	private Date  custUpdatedOn;    
	
	@Column(name = "updated_by")
	private String  custUpdatedBy; 

}