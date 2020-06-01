package com.test.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/spring/jsonxml")
public class SpringJSONXML {

	
	  @RequestMapping(value = "/prod", produces = {"application/JSON"})
	  @ResponseBody
	  String getProduces(){
	    return "Produces attribute";
	  }
	  @RequestMapping(value = "/cons", consumes = {"application/JSON", "application/XML"})
	  String getConsumes(){
	    return "Consumes attribute";
	  }
}
