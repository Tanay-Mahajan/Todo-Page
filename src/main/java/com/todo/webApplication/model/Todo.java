package com.todo.webApplication.model;

import java.util.Date;

public class Todo {
	
	private int todoId;
    private String userId;
    private String desc;
    private Date targetDate;
    private Date startDate;
    private String isDone;

    public Todo(String userId, String desc, Date targetDate, Date startDate,
            String isDone) {
        super();
        this.userId = userId;
        this.desc = desc;
        this.targetDate = targetDate;
        this.isDone = isDone;
        this.startDate = startDate;
    }
    
    public Todo() {
    	super();
	}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDesc() {
		return desc;
	}

	public String getIsDone() {
		return isDone;
	}

	public void setIsDone(String isDone) {
		this.isDone = isDone;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}