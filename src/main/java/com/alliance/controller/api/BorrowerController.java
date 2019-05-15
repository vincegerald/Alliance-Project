package com.alliance.controller.api;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.Borrower;
import com.alliance.service.BorrowerService;

@RestController(value = "borrowerApiController")
@RequestMapping(value = "/api/borrower")
public class BorrowerController {

	@Autowired
	BorrowerService borrowerService;
	
	@RequestMapping("/read")
	public List<Borrower> getBorrowerList(Borrower borrower) {
		return borrowerService.getBorrowerByStatus("IN");
	}
	
	@RequestMapping("/add")
	public Borrower saveBorrower() {
		Borrower newBorrower = new Borrower();
		newBorrower.setBorrowerFname("Ashley Angel");
		newBorrower.setBorrowerLname("Bayarcal");
		newBorrower.setBorrowerStatus("AC");
		return borrowerService.saveBorrower(newBorrower);
	}
	
	@RequestMapping("/update")
	public Borrower updateBorrower() {
		Borrower borrower = borrowerService.getBorrowerById(4);
		borrower.setBorrowerFname("Joshua Mark");
		borrower.setBorrowerStatus("IN");
		return borrowerService.saveBorrower(borrower);
	}
	
	@RequestMapping("/delete")
	public Borrower deleteBorrower() {
		Borrower borrower = borrowerService.getBorrowerById(4);
		borrower.setBorrowerStatus("IN");
		return borrowerService.saveBorrower(borrower);
	}
}
