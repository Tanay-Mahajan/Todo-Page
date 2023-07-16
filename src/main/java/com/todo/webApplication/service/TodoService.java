package com.todo.webApplication.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.webApplication.model.Todo;
import com.todo.webApplication.model.todos;
import com.todo.webApplication.model.todosRepo;

@Service
public class TodoService {

	@Autowired
	todosRepo todorepo;

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		List<todos> userTodo = todorepo.findTodo(user);
		userTodo.forEach((i) -> {
			System.out.println(i.getUserId());
			Todo newTodo = new Todo();
			newTodo.setTodoId(i.getTodoId());
			newTodo.setDesc(i.getDescription());
			newTodo.setUserId(i.getUserId());
			newTodo.setTargetDate(i.getTargetDate());
			newTodo.setIsDone(i.isDone());
			newTodo.setStartDate(i.getStartDate());
			filteredTodos.add(newTodo);
		});
		return filteredTodos;
	}

	public void addTodo(String name, String desc, Date targetDate, String isDone, Date startDate) {
		System.out.println("Inside the addTodo");
		todos newTodo = new todos();
		newTodo.setUserId(name);
		newTodo.setDescription(desc);
		newTodo.setTargetDate(targetDate);
		newTodo.setDone(isDone);
		newTodo.setStartDate(startDate);
		todorepo.saveAndFlush(newTodo);
		System.out.println("Successfully");
	}

	public void deleteTodo(int id) {
		todorepo.deleteById(id);
	}

	public Todo retrieveTodoById(int id) {

		todos newTodos = todorepo.findUpdateTodo(id);
		Todo updateTodo = new Todo();
		updateTodo.setDesc(newTodos.getDescription());
		updateTodo.setIsDone(newTodos.isDone());
		updateTodo.setTargetDate(newTodos.getTargetDate());
		updateTodo.setUserId(newTodos.getUserId());
		updateTodo.setStartDate(newTodos.getStartDate());
		return updateTodo;

	}
}