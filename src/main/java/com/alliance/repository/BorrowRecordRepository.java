package com.alliance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alliance.entity.BorrowRecord;

@Repository("borrowRecordRepository")
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Integer>{

	public List<BorrowRecord> findAll();

	@Query(value = "select br from BorrowRecord br where br.RecordStatus  = :status") 
	public List<BorrowRecord> findBorrowRecordByRecordStatus(@Param("status") String status);
	
}
