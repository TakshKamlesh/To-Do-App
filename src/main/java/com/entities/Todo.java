package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TodoId;
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
