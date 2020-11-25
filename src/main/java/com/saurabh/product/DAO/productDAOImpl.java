package com.saurabh.product.DAO;

import java.util.HashMap;
import java.util.Map;

import com.saurabh.product.dto.product;

public class productDAOImpl implements productDAO {

	Map<Integer ,product> products = new HashMap<>();
	@Override
	public void create(product product) {
		// TODO Auto-generated method stub
		products.put(product.getId(), product);
		

	}

	@Override
	public product read(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void update(product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
