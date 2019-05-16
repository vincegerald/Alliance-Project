//package com.alliance.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "user", schema = "springboot", catalog = "")
//public class User {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int UserId;
//	
//	private String UserFname, UserLname, UserType, UserStatus;
//
//	@Column(name = "UserId", nullable = false)
//	public int getUserId() {
//		return UserId;
//	}
//
//	public void setUserId(int userId) {
//		UserId = userId;
//	}
//
//	@Column(name = "UserFname", nullable = false, length = 50)
//	public String getUserFname() {
//		return UserFname;
//	}
//
//	public void setUserFname(String userFname) {
//		UserFname = userFname;
//	}
//
//	@Column(name = "UserLname", nullable = false, length = 50)
//	public String getUserLname() {
//		return UserLname;
//	}
//
//	public void setUserLname(String userLname) {
//		UserLname = userLname;
//	}
//
//	@Column(name = "UserType", nullable = false, length = 1)
//	public String getUserType() {
//		return UserType;
//	}
//
//	public void setUserType(String userType) {
//		UserType = userType;
//	}
//
//	@Column(name = "UserStatus", nullable = false, length = 2)
//	public String getUserStatus() {
//		return UserStatus;
//	}
//
//	public void setUserStatus(String userStatus) {
//		UserStatus = userStatus;
//	}
//	
//	
//
//}
