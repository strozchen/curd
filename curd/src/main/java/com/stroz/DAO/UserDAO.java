package com.stroz.DAO;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.stroz.entity.User;

@Component
@Scope("singleton")
public class UserDAO implements DAO<User>{

	@Autowired
	private List<User> userList = new ArrayList<>();
	
	public void init(){
		userList.add(new User(1001,"张三", "333", new Date(), "zhangsan@stroz.com","admin"));
		userList.add(new User(1002,"李四", "444", new Date(), "lisi@stroz.com","user"));
		userList.add(new User(1003,"王五", "555", new Date(), "wangwu@stroz.com","user"));
		userList.add(new User(1004,"钱六", "666", new Date(), "qianliu@stroz.com","lala"));
		userList.add(new User(1005,"赵七", "777", new Date(), "zhaoqi@stroz.com","admin"));	
		System.out.println("user dao init");
	}
	


	public List<User> getUserList() {
		return userList;
	}



	public void setUserList(List<User> userList) {
		this.userList = userList;
	}



	public UserDAO(){
	
	}
	
//	public void create(User user){
//		userList.put(user.getId(),user);
//	}
//	
//	public void update(User user){
//		userList.replace(user.getId(), user);
//	}
//	
//	public void delete(Integer id){
//		userList.remove(id);
//	}
//	
//	public User read(Integer id){
//		
//		return userList.get(id);
//	}
//	
//	public List<User> batchRead(){
//		List<User> list = new ArrayList<>(userList.values());
//		return list;
//	}



	@Override
	public User read(Integer id) {
		
		return userList.get(id);
	}



	@Override
	public void create(User entity) {
		// TODO Auto-generated method stub
		System.out.println("create");
		userList.add(entity.getId(),entity);
	}



	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		System.out.println("update");
		userList.set(entity.getId(), entity);

	}



	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		System.out.println("delete by entity");
		userList.remove(entity.getId());
	}



	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("delete by id");
		userList.remove(id);
	}



	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		System.out.println("get all");
		return userList;
	}



	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		System.out.println("get count");
		return userList.size();
	}


	
}
