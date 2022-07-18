package com.bajaj.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bajaj.restapi.model.Array;

@Controller
@RequestMapping("/api/test")
public class ArrayController {

	Array array = new Array();

	@PostMapping()
	
	public void setArray(@RequestBody int[] arr) {
		array.setArr(arr);
		System.out.println(HttpStatus.CREATED);		
	
	}
	
	@GetMapping({"arr"})
	@ResponseBody
	public int[] getArray() {
		return array.getArr();
	}
}
