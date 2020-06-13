package com.userloginreg.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.userloginreg.demo.model.User;
import com.userloginreg.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository uRepo;

	public UserService(UserRepository uRepo){
		this.uRepo = uRepo;
	
	}
	
	public void saveUser(User user) {
	
		uRepo.save(user);
	}
	public List<User> showAllUser() {
		List<User> users = new ArrayList<User>();
		
		for(User user: uRepo.findAll()) {
			users.add(user);
		}
		return users;
	}
}
