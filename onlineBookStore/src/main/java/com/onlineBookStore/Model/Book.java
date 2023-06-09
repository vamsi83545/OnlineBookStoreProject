package com.onlineBookStore.Model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name = "name", nullable = false)
	@NotBlank(message = "{book.name.notBlank}")
	private String name;

	@Column(name = "price", nullable = false)
	@NotNull(message = "{book.price.notBlank}")
	private BigDecimal price;

	@Column(name = "authors", nullable = false)
	@NotBlank(message = "{book.authors.notBlank}")
	private String author;

	@Column(name = "isbn", nullable = false)
	@NotBlank(message = "{book.isbn.notBlank}")
	private String isbn;

	@Column(name = "publisher", nullable = false)
	@NotBlank(message = "{book.publisher.notBlank}")
	private String publisher;

	@Column(name = "date", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "{book.date.notNull}")
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

	public Book(long id, @NotBlank(message = "{book.name.notBlank}") String name,
			@NotNull(message = "{book.price.notBlank}") BigDecimal price,
			@NotBlank(message = "{book.authors.notBlank}") String author,
			@NotBlank(message = "{book.isbn.notBlank}") String isbn,
			@NotBlank(message = "{book.publisher.notBlank}") String publisher,
			@NotNull(message = "{book.date.notNull}") Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
		this.date = date;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", isbn=" + isbn
				+ ", publisher=" + publisher + ", date=" + date + "]";
	}
	

}