package com.todo.webApplication.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface userLoginDetailsRepo extends JpaRepository<userLoginDetails,Integer>{
	
	@Query(value = "SELECT"
			+ "    CASE WHEN EXISTS"
			+ "    ("
			+ "          SELECT * FROM user_login_details u WHERE u.user_id = :userId and u.user_password = :userPassword "
			+ "    )"
			+ "    THEN 'TRUE'"
			+ "    ELSE 'FALSE'"
			+ " END",nativeQuery = true)
	boolean findUserExtist(@Param("userId") String userId,@Param("userPassword") String userPassword);
}
