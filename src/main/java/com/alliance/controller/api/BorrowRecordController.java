package com.alliance.controller.api;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.BookEntity;
import com.alliance.entity.BorrowRecord;
import com.alliance.entity.Borrower;
import com.alliance.service.BorrowRecordService;

@RestController(value = "borrowRecordApiController")
@RequestMapping(value = "/api/records")
public class BorrowRecordController {

	@Autowired
	BorrowRecordService borrowRecordService;
	
	@RequestMapping("/read")
	public List<BorrowRecord> getRecordList(BorrowRecord record) {
		return borrowRecordService.getBorrowRecordByRecordStatus("CL");
	}
	
	@RequestMapping("/add")
	public void saveBorrowRecord() throws ParseException {
		
		BorrowRecord record = new BorrowRecord();
		BorrowRecord record1 = new BorrowRecord();
		
		BookEntity bookEntity = new BookEntity();
		BookEntity bookEntity1 = new BookEntity();
		
		bookEntity.setBookId(1);
		bookEntity1.setBookId(2);


	
		
		Borrower borrower = new Borrower();
		Borrower borrower1 = new Borrower();
		
		borrower.setBorrowerId(1);
		borrower1.setBorrowerId(2);
	
		
		record.setBookEntity(bookEntity);
		record.setBookEntity(bookEntity1);
		
		record.setBorrower(borrower);
		record.setBorrower(borrower1);
		
		record1.setBookEntity(bookEntity);
		record1.setBookEntity(bookEntity1);
		
		record1.setBorrower(borrower);
		record1.setBorrower(borrower1);
		
		
		Date borrowDate = (Date) new SimpleDateFormat("MM/dd/yyyy").parse("05/15/2019");
		record.setRecordBorrowedDate(borrowDate);
		
		record.setRecordRemarks("Good Condition");
		record.setRecordStatus("OP");
		
		record1.setRecordBorrowedDate(borrowDate);
		
		record1.setRecordRemarks("Good Conditionaaa");
		record1.setRecordStatus("OP");
		
		borrowRecordService.saveRecord(record);
		borrowRecordService.saveRecord(record1);
		
	}
	
//	@RequestMapping("/update")
//	public BorrowRecord updateBorrowRecord() throws ParseException {
//		BorrowRecord record = new BorrowRecord();
//		record = borrowRecordService.getBorrowRecordById(1);
//		Date returnDate = (Date) new SimpleDateFormat("MM/dd/yyyy").parse("05/20/2019");
//		record.setRecordReturnedDate(returnDate);
//		record.setRecordStatus("CL");
//		return borrowRecordService.saveRecord(record);
//	}
//	
//	@RequestMapping("/delete")
//	public BorrowRecord deleteBorrowRecord() {
//		BorrowRecord record = new BorrowRecord();
//		record = borrowRecordService.getBorrowRecordById(1);
//		record.setRecordStatus("CL");
//		return borrowRecordService.saveRecord(record);
//	}
	
}
