package com.alliance.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.Admin;
import com.alliance.service.AdminService;

@RestController(value = "AdminApiController")
@RequestMapping(value = "/api/admins")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping("/read")
	public List<Admin> getAdminList(Admin admin) {
		return adminService.getAdminByAdminStatus("AC");
	}
	
	@RequestMapping("/add")
	public Admin saveAdmin() {
		Admin admin = new Admin();
		admin.setAdminPass("helloworld123");
		admin.setAdminFname("Vince");
		admin.setAdminLname("Dela Cerna");
		admin.setAdminStatus("AC");
		return adminService.saveAdmin(admin);
	}
	
	@RequestMapping("/update")
	public Admin updateAdmin() {
		Admin admin = adminService.getAdminById(1);
		admin.setAdminFname("Vince Gerald");
		admin.setAdminPass("alliance@12345");
		return adminService.saveAdmin(admin);
	}
	
	@RequestMapping("/delete")
	public Admin deleteAdmin() {
		Admin admin = adminService.getAdminById(1);
		admin.setAdminStatus("IN");
		return adminService.saveAdmin(admin);
	}
	
}
