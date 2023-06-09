package com.onlineBookStore.Model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "order_date", nullable = false)
	private LocalDate orderDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name ="customer_id")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "book_id")
	private Book book;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", customer=" + customer + ", book=" + book + "]";
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Order(long id, LocalDate orderDate, Customer customer, Book book) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.customer = customer;
		this.book = book;
	}

	public Order() {
		super();
	}

	

	

}
