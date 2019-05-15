package com.alliance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book", schema = "book_db", catalog = "")
public class BookEntity {

	private int BookId;
	private String BookTitle, BookAuthor, BookVersion, BookStatus; 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BookId", nullable = false, length = 11)
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	@Column(name = "BookTitle", nullable = false, length = 150)
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	
	@Column(name = "BookAuthor", nullable = false, length = 100)
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	
	@Column(name = "BookVersion", nullable = true, length = 5)
	public String getBookVersion() {
		return BookVersion;
	}
	public void setBookVersion(String bookVersion) {
		BookVersion = bookVersion;
	}
	
	@Column(name = "BookStatus", nullable = false, length = 2)
	public String getBookStatus() {
		return BookStatus;
	}
	public void setBookStatus(String bookStatus) {
		BookStatus = bookStatus;
	}
	
}
