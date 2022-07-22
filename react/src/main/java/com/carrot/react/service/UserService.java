package com.carrot.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrot.react.dao.UserDao;
import com.carrot.react.domain.User;

@Service
public class UserService {
	@Autowired private UserDao udao;
	
	public int insert(User user) {
		return udao.insert(user);
	}
	
	public List<User> getList(){
		return udao.getList();
	}
}
