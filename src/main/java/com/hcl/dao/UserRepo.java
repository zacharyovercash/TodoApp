package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.DAOUser;

@Repository
public interface UserRepo extends JpaRepository<DAOUser, Long>{
	UserRepo findByUsername(String username);
}
