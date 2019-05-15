package com.alliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliance.entity.BorrowRecord;
import com.alliance.repository.BorrowRecordRepository;

@Service("borrowRecordService")
public class BorrowRecordService {

	@Autowired
	BorrowRecordRepository borrowRecordRepository;
	
	public List<BorrowRecord> getBorrowerList(){
		List<BorrowRecord> Records = borrowRecordRepository.findAll();
		return Records;
		
	}
	
	public BorrowRecord saveRecord(BorrowRecord record) {
		return borrowRecordRepository.save(record);
	}
	
	public BorrowRecord getBorrowRecordById(int id) {
		return borrowRecordRepository.findOne(id);
	}
	
	public List<BorrowRecord> getBorrowRecordByRecordStatus(String status) {
		return borrowRecordRepository.findBorrowRecordByRecordStatus(status);
	}
}
