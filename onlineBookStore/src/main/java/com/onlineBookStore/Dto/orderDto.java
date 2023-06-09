package com.onlineBookStore.Dto;

import java.time.LocalDate;

public class orderDto {
	
	private long id;
	private LocalDate orderDate;
	
	private customerDto customer;
	private bookDto book;
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
	public customerDto getCustomer() {
		return customer;
	}
	public void setCustomer(customerDto customer) {
		this.customer = customer;
	}
	public bookDto getBook() {
		return book;
	}
	public void setBook(bookDto book) {
		this.book = book;
	}
	public orderDto(long id, LocalDate orderDate, customerDto customer, bookDto book) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.customer = customer;
		this.book = book;
	}
	public orderDto() {
		super();
	}
	@Override
	public String toString() {
		return "orderDto [id=" + id + ", orderDate=" + orderDate + ", customer=" + customer + ", book=" + book + "]";
	}
	
	
}
