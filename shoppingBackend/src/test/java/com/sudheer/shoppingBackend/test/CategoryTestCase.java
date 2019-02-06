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
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	
	 /* @Test 
	  public void testAddCategory() {
	  
		  category = new Category();
		  
		  category.setName("Television");
		  category.setDescription("This is some discription for Television");
		  category.setImageURL("CAT_1.png");
		  
		  assertEquals("Successfully added a category into the table",true,categoryDAO.add(category)); 
	  }
	 

	
	 @Test 
	 public void testGetCategory() {
	  
	 category = categoryDAO.get(1);
	  
	 assertEquals("Successfully fetched a category from the table","Television",category.getName());
	  
	  
	  }
	 

	
	  @Test 
	  public void testUpdateCategory() {
	  
	  category = categoryDAO.get(1);
	  
	  category.setName("TV");
	  
	  assertEquals("Successfully Updated a category in the table",true,
	  categoryDAO.update(category));
	  
	  
	  }
	 

	
	  @Test 
	  public void testDeleteCategory() {
	  
	  category = categoryDAO.get(1);
	  
	  assertEquals("Successfully Deleted a category From the table",true,
	  categoryDAO.delete(category));
	  
	  }
	  
	  @Test 
		public void testListCategory() {
	 
		assertEquals("Successfully fetched a list of categories From the table",3,categoryDAO.list().size());
	  
	 }
	  */
	 

	

	

	@Test
	public void testCURDCategory() {
		
		
		//Add Operation
			category = new Category();//First Category
		  
			category.setName("Television");
			category.setDescription("This is some discription for Television");
			category.setImageURL("CAT_1.png");
		  
			assertEquals("Successfully added a category into the table",true,categoryDAO.add(category));
			
			category = new Category();//Second Category
			  
			category.setName("Mobile");
			category.setDescription("This is some discription for Mobile");
			category.setImageURL("CAT_2.png");
			  
			assertEquals("Successfully added a category into the table",true,categoryDAO.add(category));
			
			category = new Category();//Third Category
			  
			category.setName("Laptop");
			category.setDescription("This is some discription for Laptop");
			category.setImageURL("CAT_3.png");
			  
			assertEquals("Successfully added a category into the table",true,categoryDAO.add(category));
			
			//Fetch And Update Operation
			
			category = categoryDAO.get(3);
			
			category.setName("Lappy");
			
			assertEquals("Successfully updated a single category in the table", true,categoryDAO.update(category));
		  
			//Delete the category
			
			assertEquals("Successfully Deleted a category From the table",true,categoryDAO.delete(category));

			//Fetching The List
			
			assertEquals("Successfully fetched a list of categories From the table",2,categoryDAO.list().size());

			

	}

}
