package com.sudheer.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sudheer.shoppingBackend.dao.CategoryDAO;
import com.sudheer.shoppingBackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","Home");
		modelAndView.addObject("userClickHome",true);
		
		modelAndView.addObject("categories",categoryDAO.list());
		
		return modelAndView;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","About-Us");
		modelAndView.addObject("userClickAbout",true);		
		return modelAndView;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","Contact-Us");
		modelAndView.addObject("userClickContact",true);		
		return modelAndView;
	}
	
	/*
	 * Method to load all the products and based on category
	 */
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProduct() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","All Products");
		
		modelAndView.addObject("categories",categoryDAO.list());
		
		modelAndView.addObject("userClickAllProducts",true);		
		return modelAndView;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProduct(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("page");
		
		//CategoryDAO to fetch a single category
		
		Category category = null;
		category = categoryDAO.get(id);
		modelAndView.addObject("title",category.getName());
		
		//passing the list of Category
		modelAndView.addObject("categories",categoryDAO.list());
		
		//passing the singlecategory object
		modelAndView.addObject("category",category);
		
		modelAndView.addObject("userClickCategoryAllProducts",true);		
		return modelAndView;
	}
}
 