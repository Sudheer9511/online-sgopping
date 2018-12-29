package com.sudheer.shoppingBackend.dao;

import java.util.List;

import com.sudheer.shoppingBackend.dto.Category;

public interface CategoryDAO {
	
	 List<Category> list();

	Category get(int id);
}
