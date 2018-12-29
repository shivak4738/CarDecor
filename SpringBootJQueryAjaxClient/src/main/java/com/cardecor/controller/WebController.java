package com.cardecor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/cardecor")
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