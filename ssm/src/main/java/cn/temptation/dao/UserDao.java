package cn.temptation.dao;

import java.util.List;

import cn.temptation.domain.User;

public interface UserDao {
	public abstract User findByUsername(String username);

	public abstract List<User> getAllUsers();
}