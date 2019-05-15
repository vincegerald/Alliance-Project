package com.alliance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Borrower {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int BorrowerId;
	
	private String BorrowerFname, BorrowerLname, BorrowerStatus;
	
	@Column(name = "BorrowerId", nullable = false)
	public int getBorrowerId() {
		return BorrowerId;
	}
	
	public void setBorrowerId(int borrowerId) {
		BorrowerId = borrowerId;
	}
	
	@Column(name = "BorrowerFname", nullable = false, length = 50)
	public String getBorrowerFname() {
		return BorrowerFname;
	}
	
	public void setBorrowerFname(String borrowerFname) {
		BorrowerFname = borrowerFname;
	}
	
	@Column(name = "BorrowerLname", nullable = false, length = 50)
	public String getBorrowerLname() {
		return BorrowerLname;
	}
	
	public void setBorrowerLname(String borrowerLname) {
		BorrowerLname = borrowerLname;
	}
	
	@Column(name = "BorrowerStatus", nullable = false, length = 2)
	public String getBorrowerStatus() {
		return BorrowerStatus;
	}
	
	public void setBorrowerStatus(String borrowerStatus) {
		BorrowerStatus = borrowerStatus;
	}
	
}
