package com.piyush.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@NamedQueries({
	@NamedQuery(name = "maxamount",
			query = "select max(price) from Product"
			),
	@NamedQuery(name = "minamount",
	query = "select min(price) from Product p where p.barcode = :barcode"
	),
})
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "product_id")
	private int productId;
	@Column(name = "barcode")
	private String barcode;
	@Column(name = "price")
	private int price;
	@Column(name = "notes")
	private String notes;
	@Column(name = "store")
	private String store;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public int getProductId() {
		return productId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}