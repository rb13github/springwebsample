package com.test.demo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test/docker/web")
public class SpringWebDemo {
	
	@GetMapping
	public String webget (){
		return " Test docker web successful";
	
	}
	 
	@RequestMapping(value = "/name")
	  String getName(@RequestParam(value = "person", defaultValue = "RB") String personName ){
	    return "Required element of request param ="+personName;
	  }
	//!-- localhost:8090/home/id?id=5
	  @RequestMapping(value = "/id")                
	  String getIdByValue(@RequestParam("id") String personId){
	    System.out.println("ID is "+personId);
	    return "Get ID from query string of URL with value element personId="+personId;
	  }
	  
	//  localhost:8090/home/personId?personId=5
			  
	  @RequestMapping(value = "/personId")              
	  String getId(@RequestParam String personId){
	    System.out.println("ID is "+personId);  
	    return "Get ID from query string of URL without value element personId="+personId;  
	  }
}
