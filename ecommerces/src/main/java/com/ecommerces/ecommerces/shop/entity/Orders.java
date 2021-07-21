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
@Table(name = "Orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderID;
	
	@Column(name = "order_amount")
	private String orderAmount;
	
	@Column(name = "cust_id")
	private String customerId;    
	
	@Column(name = "created_on")
	private Date  custCreatedOn;
	
	@Column(name = "created_by")
	private String  custCreatedBy;    
	
	@Column(name = "updated_on")
	private Date  custUpdatedOn;    
	
	@Column(name = "updated_by")
	private String  custUpdatedBy; 
	
	
}