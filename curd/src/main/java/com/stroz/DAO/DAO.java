package com.stroz.DAO;


import java.util.List;

public interface DAO<T> {
	//����ID��ȡʵ��
	T read(Integer id);
	//����ʵ��
	void create(T entity);
	//����
	void update(T entity);
	//ɾ��
	void delete(T entity);
	//����IDɾ��
	void delete(Integer id);
	//��ȡ����
	List<T> getAll();
	//��ȡ����
	long getCount();

	
	
}
