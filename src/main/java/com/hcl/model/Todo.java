package com.hcl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

	@Id 
	private long todoId;
	private String todoName;
	private String todoDescription;
	public long getTodoId() {
		return todoId;
	}
	public void setTodoId(long todoId) {
		this.todoId = todoId;
	}
	public String getTodoName() {
		return todoName;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}
	public String getTodoDescription() {
		return todoDescription;
	}
	public void setTodoDescription(String todoDescription) {
		this.todoDescription = todoDescription;
	}
	public Todo(long todoId, String todoName, String todoDescription) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
		this.todoDescription = todoDescription;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
