package com.alliance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "admin", schema = "springboot", catalog = "")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int AdminId;
	
	private String AdminPass, AdminFname, AdminLname, AdminStatus;

	@Column(name = "AdminId", nullable = false)
	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	@Column(name = "AdminPass", nullable = false, length = 15)
	public String getAdminPass() {
		return AdminPass;
	}

	public void setAdminPass(String adminPass) {
		AdminPass = adminPass;
	}

	@Column(name = "AdminFname", nullable = false, length = 50)
	public String getAdminFname() {
		return AdminFname;
	}

	public void setAdminFname(String adminFname) {
		AdminFname = adminFname;
	}

	@Column(name = "AdminLname", nullable = false, length = 50)
	public String getAdminLname() {
		return AdminLname;
	}

	public void setAdminLname(String adminLname) {
		AdminLname = adminLname;
	}

	@Column(name = "AdminStatus", nullable = false, length = 2)
	public String getAdminStatus() {
		return AdminStatus;
	}

	public void setAdminStatus(String adminStatus) {
		AdminStatus = adminStatus;
	}
	
	
}
