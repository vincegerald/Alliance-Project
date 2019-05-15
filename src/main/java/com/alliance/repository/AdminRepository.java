package com.alliance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alliance.entity.Admin;

@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	public List<Admin> findAll();

	@Query(value = "select a from Admin a where a.AdminStatus = :status") 
	public List<Admin> findAdminByAdminStatus(@Param("status") String status);
	
}
