package com.userloginreg.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.userloginreg.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);

}
