package com.hcl.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.TodoRepo;
import com.hcl.model.Todo;

@Service
public class TodoService {

	@Autowired
	private TodoRepo repo;
	
	
	
	public List<Todo> getTodos(){
		List<Todo> todos = repo.findAll();
		return todos;
	}
	
	public Todo getTodoById(long id)
	{
		Todo current = repo.findById(id).get();
		return current;
	}
	
	public void addTodo(Todo todo) {
		repo.save(todo);
	}
	
	public void addList(List<Todo>lst)
	{
		for(Todo t : lst)
		{
			repo.save(t);
		}
	}
}
