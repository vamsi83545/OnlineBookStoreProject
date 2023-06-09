package com.onlineBookStore.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class bookDto {
	
	
	long id;
	
	private String name;
	private BigDecimal price;
	private String author;
	private String isbn;
	private String publisher;
	private Date date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public bookDto(long id, String name, BigDecimal price, String author, String isbn, String publisher, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
		this.date = date;
	}
	public bookDto() {
		super();
	}
	@Override
	public String toString() {
		return "bookDto [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", isbn=" + isbn
				+ ", publisher=" + publisher + ", date=" + date + "]";
	}
	
}