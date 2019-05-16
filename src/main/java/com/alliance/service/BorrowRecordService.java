package com.alliance.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.alliance.entity.BookEntity;
import com.alliance.entity.BorrowRecord;
import com.alliance.entity.Borrower;
import com.alliance.repository.BorrowRecordRepository;

@Service("borrowRecordService")
public class BorrowRecordService {

	@Autowired
	BorrowRecordRepository borrowRecordRepository;
	
	public List<BorrowRecord> getBorrowerList(){
		List<BorrowRecord> Records = borrowRecordRepository.findAll();
		return Records;
		
	}
	
	public void saveRecord(BorrowRecord record) {
		
		borrowRecordRepository.save(record);
		
	}
	
	public BorrowRecord getBorrowRecordById(int id) {
		return borrowRecordRepository.findOne(id);
	}
	
	public List<BorrowRecord> getBorrowRecordByRecordStatus(String status) {
		return borrowRecordRepository.findBorrowRecordByRecordStatus(status);
	}
}
