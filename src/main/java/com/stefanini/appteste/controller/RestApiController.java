package com.stefanini.appteste.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.appteste.entities.Product;

@RestController
@RequestMapping("rest")
public class RestApiController {
	
	@GetMapping(path = "/list",headers = "Accept=*/*", produces="application/json") 
	@ResponseBody
	public List<Product> getList(){
		List<Product> var = new ArrayList<Product>();
		Product p = new Product();
		p.setId(1);
		p.setName("leonardo");
		var.add(p);
		var.add(p); 
		return var;
	}

}
