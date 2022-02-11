package com.entities;

import java.util.Date;

public class Todo {
	
	private String TodoTitle;
	private String TodoContent;
	private Date date;
	
	public Todo(String todoTitle, String todoContent, Date date) {
		
		TodoTitle = todoTitle;
		TodoContent = todoContent;
		this.date = date;
	}

	public Todo() {
	
	}

	public String getTodoTitle() {
		return TodoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		TodoTitle = todoTitle;
	}

	public String getTodoContent() {
		return TodoContent;
	}

	public void setTodoContent(String todoContent) {
		TodoContent = todoContent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
