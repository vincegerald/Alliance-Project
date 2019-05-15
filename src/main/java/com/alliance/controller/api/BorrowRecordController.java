package com.alliance.controller.api;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.BorrowRecord;
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
	public BorrowRecord saveBorrowRecord() throws ParseException {
		BorrowRecord record = new BorrowRecord();
		record.setRecordBookId(1);
		record.setRecordBorrowerId(2);
		
		Date borrowDate = (Date) new SimpleDateFormat("MM/dd/yyyy").parse("05/15/2019");
		record.setRecordBorrowedDate(borrowDate);
		
		record.setRecordRemarks("Good Condition");
		record.setRecordStatus("OP");
		return borrowRecordService.saveRecord(record);
	}
	
	@RequestMapping("/update")
	public BorrowRecord updateBorrowRecord() throws ParseException {
		BorrowRecord record = new BorrowRecord();
		record = borrowRecordService.getBorrowRecordById(1);
		Date returnDate = (Date) new SimpleDateFormat("MM/dd/yyyy").parse("05/20/2019");
		record.setRecordReturnedDate(returnDate);
		record.setRecordStatus("CL");
		return borrowRecordService.saveRecord(record);
	}
	
	@RequestMapping("/delete")
	public BorrowRecord deleteBorrowRecord() {
		BorrowRecord record = new BorrowRecord();
		record = borrowRecordService.getBorrowRecordById(1);
		record.setRecordStatus("CL");
		return borrowRecordService.saveRecord(record);
	}
	
}
