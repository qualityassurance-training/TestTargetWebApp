/**
 * 
 */
package com.stefanini.appteste.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stefanini.appteste.entities.Product;
import com.stefanini.appteste.model.ApiClientRest;

/**
 * @author lofreitas2
 *
 */

@Controller
@RequestMapping("product")
public class ProductController_ {

	
	@GetMapping("/")
	public ModelAndView getList(ModelMap model) {
		
		Product[] pp = ApiClientRest.get("http://localhost:8081/app/rest/list",Product[].class);
		
		List<Product> products = Arrays.asList(pp);

		model.addAttribute("products",products);
		return new ModelAndView("/product/index",model);
	}
	
	@GetMapping("/add")
	public String add() {
		return "/product/add";
	}
	@GetMapping("/edit/{id}")
	public String edit() {
		return "/product/edit";
	}
}
