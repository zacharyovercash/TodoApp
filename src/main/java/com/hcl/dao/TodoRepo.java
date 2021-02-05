package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long>{

}
