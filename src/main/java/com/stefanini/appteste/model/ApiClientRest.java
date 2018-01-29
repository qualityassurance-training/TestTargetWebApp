package com.stefanini.appteste.model;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApiClientRest {

	public static <T> T[] get(String uri, Class<T[]> clazz) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.getForObject(uri, clazz);
	}
	
public static <T> T post(String uri, Class<T> clazz, T requestParam) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<T> request = new HttpEntity<>(requestParam);
		ResponseEntity<T> response = restTemplate
		  .exchange(uri, HttpMethod.POST, request, clazz);
	  
		T obj = response.getBody();
		
		return obj;
	}

}
