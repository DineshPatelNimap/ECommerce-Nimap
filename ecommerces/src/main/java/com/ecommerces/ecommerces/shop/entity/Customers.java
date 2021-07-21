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
@Table(name = "Customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {

	@Id
	@Column(name = "cust_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
   	private Long  customerId ;
	
	@Column(name = "cust_firstname")
	private String custFirstName;
	
	@Column(name = "cust_lastname")
	private String custLastName;
	
	@Column(name = "cust_email")
	private String custEmail;   
	
	@Column(name = "cust_mobile")
	private String  custMobile;  
	
	@Column(name = "cust_alternate")
	private String  custAlternateMobile;
	
	@Column(name = "cust_address")
	private String  custAddress; 
	
	@Column(name = "created_on")
	private Date  custCreatedOn;
	
	@Column(name = "created_by")
	private String  custCreatedBy;    
	
	@Column(name = "updated_on")
	private Date  custUpdatedOn;    
	
	@Column(name = "updated_by")
	private String  custUpdatedBy; 
}