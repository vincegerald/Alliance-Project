package com.alliance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "book", schema = "springboot", catalog = "")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BookId", nullable = false, length = 11)
	private int BookId;
	
	@Column(name = "BookTitle", nullable = false, length = 150)
	private String BookTitle;
	
	@Column(name = "BookAuthor", nullable = false, length = 100)
	private String BookAuthor;
	
	@Column(name = "BookVersion", nullable = false, length = 100)
	private String BookVersion;
	
	@Column(name = "BookStatus", nullable = true, length = 5)
	private String BookStatus; 
	
	
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	
	
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	
	
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
