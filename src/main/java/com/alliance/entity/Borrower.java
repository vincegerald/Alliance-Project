package com.alliance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity

@Table(name = "borrower", schema = "springboot", catalog = "")
public class Borrower {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BorrowerId", nullable = false)
	private int BorrowerId;
	
	@Column(name = "BorrowerFname", nullable = false, length = 50)
	private String BorrowerFname;
	
	@Column(name = "BorrowerLname", nullable = false, length = 50)
	private String BorrowerLname;
	
	@Column(name = "BorrowerStatus", nullable = false, length = 2)
	private String BorrowerStatus;
	
	
	public int getBorrowerId() {
		return BorrowerId;
	}
	
	public void setBorrowerId(int borrowerId) {
		BorrowerId = borrowerId;
	}
	
	
	public String getBorrowerFname() {
		return BorrowerFname;
	}
	
	public void setBorrowerFname(String borrowerFname) {
		BorrowerFname = borrowerFname;
	}
	
	
	public String getBorrowerLname() {
		return BorrowerLname;
	}
	
	public void setBorrowerLname(String borrowerLname) {
		BorrowerLname = borrowerLname;
	}
	
	
	public String getBorrowerStatus() {
		return BorrowerStatus;
	}
	
	public void setBorrowerStatus(String borrowerStatus) {
		BorrowerStatus = borrowerStatus;
	}
	
}
