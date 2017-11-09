package com.pawan.product.service;

import java.util.List;

import com.pawan.product.model.Product;


/**
 * This holds the interaction for DAO layer.
 * @author pawank
 *
 * @param <Product>
 */
public interface ProductService{

	Product getById(String id);

	Product add(Product obj);

	Product edit(Product obj);

	Boolean delete(Product object);

	List<Product> getAll();
    
}