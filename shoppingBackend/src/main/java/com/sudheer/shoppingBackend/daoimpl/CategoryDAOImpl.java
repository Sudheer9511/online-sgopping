package com.sudheer.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sudheer.shoppingBackend.dao.CategoryDAO;
import com.sudheer.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		
		//First Category
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("Some discription for Telivision");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
	 	
		
		//Second Category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Some discription for Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//Third Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Some discription for Laptop");
		category.setImageURL("CAT_3.png");
				
				categories.add(category);
	}
	
	
	public List<Category> list() {
		return categories;
	}


	@Override
	public Category get(int id) {

		//enhance for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
