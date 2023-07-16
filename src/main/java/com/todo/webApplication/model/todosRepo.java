package com.todo.webApplication.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface todosRepo extends JpaRepository<todos,Integer>{
	@Query(value = "select * from todos where user_id = :userId",nativeQuery = true)
	List<todos> findTodo(@Param("userId") String userId);

	@Query(value = "select * from todos where todo_id = :todoId",nativeQuery = true)
	todos findUpdateTodo(@Param("todoId") int todoId);
	
}
