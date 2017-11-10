package com.pawan.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pawan.product.model.Product;

@Controller
@RequestMapping("/products")
public class ProductMVCController {
	@RequestMapping(value = "/add", method = RequestMethod.GET) 
	public String displayLogin(Model model) { 
	    model.addAttribute("product", new Product()); 
	    return "sample"; 
	}
}