package com.alliance.controller.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.service.BookService;
import com.alliance.entity.BookEntity;

@RestController(value = "BookApiController")
@RequestMapping(value = "/api/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
		
	@RequestMapping(method = RequestMethod.GET, value = "/getAllBooks")
	public List<BookEntity> getAllBooks(){
		
		List<BookEntity> getBookList;
		
		getBookList = bookService.getBookList();
		
		return getBookList;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateBook")
	public void updateBook(BookEntity bookEntity) {
		
		String BookTitle = bookEntity.getBookTitle();
		String BookAuthor = bookEntity.getBookAuthor();
		String BookVersion = bookEntity.getBookVersion();
		String BookStatus = bookEntity.getBookStatus();
		int BookId = bookEntity.getBookId();
		
		bookEntity.setBookTitle("Changed Sample");
		bookEntity.setBookAuthor("Changed Author");
		bookEntity.setBookVersion("2.1");
		bookEntity.setBookStatus("AV");
		bookEntity.setBookId(1);
		
		bookService.updateBook(bookEntity);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteBook")
	public void deleteBook(BookEntity bookEntity) {
		
		String BookStatus = bookEntity.getBookStatus();
		int BookId = bookEntity.getBookId();
		
		bookEntity.setBookStatus("UN");
		bookEntity.setBookId(1);
		
		bookService.deleteBook(bookEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addBook")
	public void addBook(BookEntity bookEntity) {
		
		String BookTitle = bookEntity.getBookTitle();
		String BookAuthor = bookEntity.getBookAuthor();
		String BookVersion = bookEntity.getBookVersion();
		String BookStatus = bookEntity.getBookStatus();
		
		bookEntity.setBookTitle("asd");
		bookEntity.setBookAuthor("asd");
		bookEntity.setBookVersion("6.9");
		bookEntity.setBookStatus("AV");
		
		bookService.addBook(bookEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/getBooksByAuthor")
	public List<BookEntity> getBooksByAuthor(BookEntity bookEntity){
		
		List<BookEntity> getBooksByAuthorList;
		
		//String BookAuthor = bookEntity.getBookAuthor();
		String BookAuthor = "Changed Author";
		
		
		return bookService.getBooksByAuthor(BookAuthor);
	}
	
	
}