package com.alliance.service;

import org.springframework.transaction.annotation.Transactional;

import com.alliance.entity.BookEntity;
import com.alliance.repository.BookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
@Transactional(rollbackFor = Exception.class)
public class BookService {

	
	@Autowired
	BookRepository bookRepository;
	
	public List<BookEntity> getBookList(){
		
		return bookRepository.getBookList();
		
	}
	
	public void updateBook(BookEntity bookEntity) {
		
		String BookTitle = bookEntity.getBookTitle();
		String BookAuthor = bookEntity.getBookAuthor();
		String BookVersion = bookEntity.getBookVersion();
		String BookStatus = bookEntity.getBookStatus();
		int BookId = bookEntity.getBookId();
		
		bookRepository.updateBook(BookTitle, BookAuthor, BookVersion, BookStatus, BookId);
		
	}
	
	public void deleteBook(BookEntity bookEntity) {
		
		String BookStatus = bookEntity.getBookStatus();
		int BookId = bookEntity.getBookId();
		
		bookRepository.deleteBook(BookStatus, BookId);
	}
	
	public void addBook(BookEntity bookEntity) {
		
		String BookTitle = bookEntity.getBookTitle();
		String BookAuthor = bookEntity.getBookAuthor();
		String BookVersion = bookEntity.getBookVersion();
		String BookStatus = bookEntity.getBookStatus();
		
		bookRepository.addBook(BookTitle, BookAuthor, BookVersion, BookStatus);
		
	}
	
	public List<BookEntity> getBooksByAuthor(String BookAuthor){
		
		
		return bookRepository.getBooksByAuthor(BookAuthor); 
	}
	
	
}