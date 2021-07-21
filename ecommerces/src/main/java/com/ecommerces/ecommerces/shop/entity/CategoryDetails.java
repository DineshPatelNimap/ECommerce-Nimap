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
@Table(name = "CategoryDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoryDetails {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "created_on")
	private Date  custCreatedOn;
	
	@Column(name = "created_by")
	private String  custCreatedBy;    
	
	@Column(name = "updated_on")
	private Date  custUpdatedOn;    
	
	@Column(name = "updated_by")
	private String  custUpdatedBy; 
	

}