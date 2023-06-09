package com.onlineBookStore.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineBookStore.Dto.bookDto;
import com.onlineBookStore.Exception.BookNotFoundException;
import com.onlineBookStore.Model.Book;
import com.onlineBookStore.Repository.BookRepo;

@Service
public class bookService {

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private ModelMapper modelMapper;

	public bookDto findBookById(Long id) {
	Book book = bookRepo.findById(id).orElseThrow(() -> new BookNotFoundException("book not found with id" + id));
		return modelMapper.map(book, bookDto.class);
	}

	public List<bookDto> getAllbooks() {
		List<Book> books = bookRepo.findAll();
		return books.stream().map(book -> modelMapper.map(books, bookDto.class)).collect(Collectors.toList());

	}

	public void deleteById(long id) {

		Book book = bookRepo.findById(id).orElseThrow(() -> new BookNotFoundException("book not found with id" + id));
		bookRepo.delete(book);
		System.out.println("book deleted");

	}

	public List<bookDto> findBookByAuthor(String author) {

		List<Book> books = bookRepo.findByAuthor(author);

		if (books.isEmpty()) {
			throw new BookNotFoundException("author not found" + author);

		}
		return books.stream().map(book -> modelMapper.map(books, bookDto.class)).collect(Collectors.toList());

	}

	public bookDto findByName(String name){
		Optional<Book> optionalbook = bookRepo.findByName(name);
		Book book =optionalbook.orElseThrow(() -> new BookNotFoundException("book not found with name "+name) );
		return modelMapper.map(book, bookDto.class);
	}

	public bookDto findBookByAuthorAndDate(String author, Date date) {
		Optional<Book> books = bookRepo.findByAuthorAndDate(author, date);
		
		Book book =books.orElseThrow(() -> new BookNotFoundException("book nnot found "));

		return modelMapper.map(book, bookDto.class);
	}

	public bookDto saveBook(bookDto bookDto) {
		Book book = modelMapper.map(bookDto, Book.class);
		Book savedBook=bookRepo.save(book);
		return modelMapper.map(savedBook, bookDto.class);
	}

	public List<bookDto> saveBooks(List<bookDto> bookDto) {
		List<Book> books = bookDto.stream().map(bookdto -> modelMapper.map(bookDto, Book.class))
				.collect(Collectors.toList());
		
		List<Book> savedBooks =bookRepo.saveAll(books);
		
		return savedBooks.stream().map(book -> modelMapper.map(books, bookDto.class)).collect(Collectors.toList());
		
	}
}