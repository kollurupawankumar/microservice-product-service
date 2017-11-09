package com.pawan.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.product.model.Product;
import com.pawan.product.service.ProductService;




@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
    public List<Product> getAll() {
		System.out.println("Billa :"+productService.getAll().size());
		return productService.getAll();
    }
	
	@RequestMapping("/{id}")
    public Product getById(@PathVariable("id") String id) {
		return productService.getById(id);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public Product add(@ModelAttribute Product product) {
    	return productService.add(product);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public Product edit(@ModelAttribute Product product) {
    	return productService.edit(product);
    }
    
}
