package com.javasampleapproach.jqueryajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class WebController {
	
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
    
    @GetMapping(value="/search")
    public String searchCarAccessories(){
    	return "search";
    }
}