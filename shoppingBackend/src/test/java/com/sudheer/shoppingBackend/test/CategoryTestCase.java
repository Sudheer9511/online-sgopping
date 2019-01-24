package com.sudheer.shoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sudheer.shoppingBackend.dao.CategoryDAO;
import com.sudheer.shoppingBackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.sudheer.shoppingBackend.config");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for Television");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category into the table",true,categoryDAO.add(category));
	}
	
	/*@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(1);
		
		assertEquals("Successfully fetched a category from the table","Television",category.getName());

		
	}*/

}
