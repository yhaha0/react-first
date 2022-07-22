package com.carrot.react.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carrot.react.domain.User;

@Repository
public class UserDao {
	@Autowired private SqlSessionTemplate sst;
	private final String NAMESPACE = "mapper.UserMapper";
	
	public int insert(User vo) {
		return sst.insert(NAMESPACE+".insert", vo);
	}
	
	public List<User> getList(){
		return sst.selectList(NAMESPACE+".getList");
	}
}
