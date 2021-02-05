package com.hcl.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Todo;
import com.hcl.service.TodoService;

@RestController
public class TodoController {

	
	@Autowired
	private TodoService service;

	
	@GetMapping("/todos")
	public List<Todo> todos() {
		return service.getTodos();
	}
	
	@PostMapping("/todos")
	public void saveTodo(@RequestBody Todo todo) {
		 service.addTodo(todo);
	}
}
