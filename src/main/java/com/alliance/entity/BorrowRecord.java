package com.alliance.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "borrower_record", schema = "springboot", catalog = "")
public class BorrowRecord implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int RecordId;
	
//	private int RecordBorrowerId;
	//private int RecordBookId;
	
	Date RecordBorrowedDate, RecordReturnedDate;
	String RecordRemarks, RecordStatus;
	
	@Column(name = "RecordId", nullable = false)
	public int getRecordId() {
		return RecordId;
	}
	
	public void setRecordId(int recordId) {
		RecordId = recordId;
	}

	@ManyToOne()
	@JoinColumn(name = "BorrowerId")
	private Borrower borrower;
	
	
	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}


	
	@ManyToOne()
	@JoinColumn(name = "BookId")
	private BookEntity bookEntity;
	
	public BookEntity getBookEntity() {
		return bookEntity;
	}

	public void setBookEntity(BookEntity bookEntity) {
		this.bookEntity = bookEntity;
	}
	
	
	
	@Column(name = "RecordBorrowedDate", nullable = false)
	public Date getRecordBorrowedDate() {
		return RecordBorrowedDate;
	}
	
	public void setRecordBorrowedDate(Date recordBorrowedDate) {
		RecordBorrowedDate = recordBorrowedDate;
	}
	
	
	@Column(name = "RecordReturnedDate", nullable = true)
	public Date getRecordReturnedDate() {
		return RecordReturnedDate;
	}
	
	public void setRecordReturnedDate(Date recordReturnedDate) {
		RecordReturnedDate = recordReturnedDate;
	}
	
	
	@Column(name = "RecordRemarks", nullable = false, length = 150)
	public String getRecordRemarks() {
		return RecordRemarks;
	}
	
	public void setRecordRemarks(String recordRemarks) {
		RecordRemarks = recordRemarks;
	}
	
	
	@Column(name = "RecordStatus", nullable = false, length = 2)
	public String getRecordStatus() {
		return RecordStatus;
	}
	
	public void setRecordStatus(String recordStatus) {
		RecordStatus = recordStatus;
	}
	
	
	
	
	
	
}
