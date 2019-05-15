package com.alliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliance.entity.Admin;
import com.alliance.repository.AdminRepository;

@Service("adminService")
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	public List<Admin> getAdminList(Admin admin){
		List<Admin> AdminList = adminRepository.findAll();
		return AdminList;
	}
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public Admin getAdminById(int id) {
		return adminRepository.findOne(id);
	}
	
	public List<Admin> getAdminByAdminStatus(String status) {
		return adminRepository.findAdminByAdminStatus(status);
	}
}
