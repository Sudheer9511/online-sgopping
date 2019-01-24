package com.sudheer.shoppingBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sudheer.shoppingBackend.dto.Category;
 
public interface CategoryDAO {
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	
	boolean update(Category category);

	boolean delete(Category category);
}
