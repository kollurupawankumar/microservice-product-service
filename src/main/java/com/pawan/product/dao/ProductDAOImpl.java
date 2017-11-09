package com.pawan.product.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.pawan.product.exception.DataAccessException;
import com.pawan.product.model.Product;


/**
 * 
 * @author pawank
 *
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Autowired
	protected MongoOperations mongoOperations;

	@Override
	public Product add(Product object) throws DataAccessException {
		if (logger.isDebugEnabled())
			logger.debug("Add function for the object " + object.toString());
		try {
			mongoOperations.insert(object);
			return object;
		} catch (Exception e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public Product modify(Product object) throws DataAccessException {
		if (logger.isDebugEnabled())
			logger.debug("type {} modify", object.toString());
		try {
			mongoOperations.save(object);
			return object;
		} catch (Exception e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public Product delete(Product object) throws DataAccessException {
		if (logger.isDebugEnabled())
			logger.debug("type {} delete", object.toString());
		try {
			mongoOperations.remove(object);
			return object;
		} catch (Exception e) {
			throw new DataAccessException(e);
		}

	}

	@Override
	public Product getById(Object id) throws DataAccessException {
		if (logger.isDebugEnabled())
			logger.debug("type {} getById", id);
		try {
			return mongoOperations.findById(id, Product.class);
		} catch (Exception e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public List<Product> getAll() throws DataAccessException {
		if (logger.isDebugEnabled())
			logger.debug("Product getAll function is getting called");
		try {
			System.out.println("Pawan :"+mongoOperations.findAll(Product.class).size());
			return mongoOperations.findAll(Product.class);
		} catch (Exception e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public MongoOperations getMongoOperations() {
		return mongoOperations;
	}

}
