package com.onlineBookStore.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineBookStore.Dto.bookDto;
import com.onlineBookStore.service.bookService;

@RestController
public class bookController {

	@Autowired
	private bookService bookService;

	@PostMapping("/book/save")
	public bookDto saveBook(@RequestBody bookDto bookDto) {
		return bookService.saveBook(bookDto);
	}

	@PostMapping("/saveBooks")
	public List<bookDto> saveBooks(@RequestBody List<bookDto> bookDto) {
		return bookService.saveBooks(bookDto);
	}

	@GetMapping("/book/{id}")
	public bookDto getBookById(@PathVariable("id") long id) {
		return bookService.findBookById(id);
	}

	@GetMapping("/getbooks")
	public List<bookDto> getAllBook() {
		return bookService.getAllbooks();
	}

	@GetMapping("/book/byname/{name}")
	public bookDto getBooksByName(@PathVariable(value = "name") String name) {
		return bookService.findByName(name);
	}

	@GetMapping("/book/byAuthor/{author}")
	public List<bookDto> findBookByAuthor(@PathVariable(value = "author") String author) {
		return bookService.findBookByAuthor(author);
	}

	@DeleteMapping("/book/delete/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteById(id);
	}

	@GetMapping("/book/byAuthorAndDate/{author}/{date}")
	public bookDto findBookByAuthorAndDate(@PathVariable(value = "author") String author, @PathVariable(value = "date") Date date) {
		return bookService.findBookByAuthorAndDate(author, date);
	}

}


