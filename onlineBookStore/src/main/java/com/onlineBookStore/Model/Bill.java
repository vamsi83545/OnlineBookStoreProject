package com.onlineBookStore.Model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	 private  BigDecimal price;

	@Override
	public String toString() {
		return "Bill [id=" + id + ", order=" + order + ", price=" + price + "]";
	}

	public Bill() {
		super();
	}

	public Bill(Long id, Order order, BigDecimal price) {
		super();
		this.id = id;
		this.order = order;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
