package com.stroz.DAO;


import java.util.List;

public interface DAO<T> {
	//根据ID读取实体
	T read(Integer id);
	//创建实体
	void create(T entity);
	//更新
	void update(T entity);
	//删除
	void delete(T entity);
	//根据ID删除
	void delete(Integer id);
	//读取所有
	List<T> getAll();
	//获取总数
	long getCount();

	
	
}
