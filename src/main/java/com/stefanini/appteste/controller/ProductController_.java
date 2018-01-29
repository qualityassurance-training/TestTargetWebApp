/**
 * 
 */
package com.stefanini.appteste.controller;

import java.util.ArrayList;
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
		
		List<Product> l = new ArrayList<>();
		Product p = new Product();
		p.setName("Leonardo");
		p.setId(1);
		l.add(p);
		l.add(p);
		l.add(p);
		l.add(p);
		l.add(p);
		l.add(p);
		model.addAttribute("products",l);
		return new ModelAndView("/product/index",model);
	}
	
}
