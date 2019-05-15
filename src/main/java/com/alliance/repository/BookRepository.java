package com.alliance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alliance.entity.BookEntity;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<BookEntity, Integer>  {
	
	
	@Query("select b from BookEntity b")
	List<BookEntity> getBookList();
	
	
	//select by author
	@Query(value = "select b from BookEntity b where BookAuthor like %:author%")
	List<BookEntity> getBooksByAuthor(@Param("author") String BookAuthor);
	
	//update book
	@Modifying
	@Query(value = "Update book SET BookTitle = :title, BookAuthor = :author, BookVersion = :version, BookStatus = :status where BookId = :id", nativeQuery = true)
	void updateBook(@Param("title") String BookTitle, @Param("author") String BookAuthor, @Param("version") String BookVersion, @Param("status") String BookStatus, @Param("id") int BookId);
	
	//delete book -- logical deletion
	@Modifying
	@Query(value = "Update book SET BookStatus = :status where BookId = :id", nativeQuery = true)
	void deleteBook(@Param("status") String BookStatus, @Param("id") int BookId);
	
	//add book
	@Modifying
	@Query(value = "INSERT INTO book (BookTitle, BookAuthor, BookVersion, BookStatus) VALUES (:title, :author, :version, :status)", nativeQuery = true)
	void addBook(@Param("title") String BookTitle, @Param("author") String BookAuthor, @Param("version") String BookVersion, @Param("status") String BookStatus);
}