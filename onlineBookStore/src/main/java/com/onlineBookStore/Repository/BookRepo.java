package com.onlineBookStore.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBookStore.Model.Book;

public interface BookRepo extends JpaRepository<Book, Long>{
	
	public List<Book> findByAuthor(String author);
	
	public Optional<Book>  findByName(String name);

	public Optional<Book> findByAuthorAndDate(String author,Date date);

}
