package com.pawan.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawan.product.dao.ProductDAO;
import com.pawan.product.exception.DataAccessException;
import com.pawan.product.model.Product;

@Service
/**
 * This is the main bean and it get autowired with the dao beans.
 * @author pawank
 *
 */
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;

	@Override
	public Product getById(String id) {
		try {
			return productDao.getById(id);
		} catch (DataAccessException de) {
			return null;
		}
	}

	@Override
	public Product add(Product obj) {
		try {
			return productDao.add(obj);
		} catch (DataAccessException de) {
			return null;
		}
	}

	@Override
	public Product edit(Product obj) {
		try {
			return productDao.modify(obj);
		} catch (DataAccessException de) {
			return null;
		}
	}

	@Override
	public Boolean delete(Product obj) {
		try {
			productDao.delete(obj);
			return true;
		} catch (DataAccessException de) {
			return false;
		}
	}

	@Override
	public List<Product> getAll() {
		try {
			return productDao.getAll();
		} catch (DataAccessException de) {
			return null;
		}
	}

}
