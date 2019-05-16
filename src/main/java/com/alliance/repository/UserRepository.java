//package com.alliance.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.alliance.entity.User;
//
//@Repository("userRepository")
//public interface UserRepository extends JpaRepository<User, Integer> {
//
//	public List<User> findAll();
//
//	@Query(value = "select u from User u where u.UserStatus = :status") 
//	public List<User> findUserByUserStatus(@Param("status") String status);
//}
