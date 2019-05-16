package com.alliance.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alliance.entity.Borrower;

@Repository("borrowerRepository")
public interface BorrowerRepository extends JpaRepository<Borrower, Integer>{

	public List<Borrower> findAll();

	@Query(value = "select b from Borrower b where b.BorrowerStatus = :status") 
	public List<Borrower> findBorrowerByBorrowerstatus(@Param("status") String status);
	
	
}
