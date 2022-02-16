package com.klef.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class clientcontoller {
	@GetMapping("/register")                     
    public String welcome() {
        return "register";           
    }
	@GetMapping("/login")                     
    public String login() {
        return "login";           
    }
	@GetMapping("/home")                     
    public String home() {
        return "home";           
    }
	@GetMapping("/index")                     
    public String index() {
        return "index";           
    }
	@GetMapping("/about")                     
    public String about() {
        return "about";           
    }
	@GetMapping("/blog")                     
    public String blog() {
        return "blog";           
    }
	@GetMapping("/blog-details")                     
    public String blogdetails() {
        return "blog-details";           
    }
	@GetMapping("/contact")                     
    public String contact() {
        return "contact";           
    }
	@GetMapping("/services")                     
    public String services() {
        return "services";           
    }



	

}
