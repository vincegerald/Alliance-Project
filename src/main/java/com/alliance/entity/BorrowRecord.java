package com.alliance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BorrowRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int RecordId;
	
	private int RecordBorrowerId;
	private int RecordBookId;
	
	private Date RecordBorrowedDate, RecordReturnedDate;
	private String RecordRemarks, RecordStatus;
	
	@Column(name = "RecordId", nullable = false)
	public int getRecordId() {
		return RecordId;
	}
	
	public void setRecordId(int recordId) {
		RecordId = recordId;
	}
	
	@Column(name = "RecordBorrowerId", nullable = false)
	public int getRecordBorrowerId() {
		return RecordBorrowerId;
	}
	
	public void setRecordBorrowerId(int recordBorrowerId) {
		RecordBorrowerId = recordBorrowerId;
	}
	
	@Column(name = "RecordBookId", nullable = false)
	public int getRecordBookId() {
		return RecordBookId;
	}
	
	public void setRecordBookId(int recordBookId) {
		RecordBookId = recordBookId;
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
