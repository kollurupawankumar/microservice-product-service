package com.pawan.product.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;

import com.pawan.product.exception.DataAccessException;
import com.pawan.product.model.Product;

/**
 * 
 * @author pawank
 *
 */
public interface ProductDAO  {
	
	Product getById(Object id) throws DataAccessException;
   
    List<Product> getAll() throws DataAccessException;
    
    Product add(Product object) throws DataAccessException;
    
    Product modify(Product object) throws DataAccessException;
    
    Product delete(Product object) throws DataAccessException;

    MongoOperations getMongoOperations();

}