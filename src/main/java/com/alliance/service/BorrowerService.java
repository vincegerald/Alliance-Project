package com.alliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliance.entity.Borrower;
import com.alliance.repository.BorrowerRepository;

@Service("borrowerService")
public class BorrowerService {
	
	@Autowired
	BorrowerRepository borrowerRepository;
	
	public List<Borrower> getBorrowerList(Borrower borrower){
		List<Borrower> borrowerList = borrowerRepository.findAll();
		return borrowerList;
		
	}
	
	public Borrower saveBorrower(Borrower borrower) {
		return borrowerRepository.save(borrower);
	}
	
	public Borrower getBorrowerById(int id) {
		return borrowerRepository.findOne(id);
	}
	
	public List<Borrower> getBorrowerByStatus(String status) {
		return borrowerRepository.findBorrowerByBorrowerstatus(status);
	}
}
