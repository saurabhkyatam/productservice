package com.saurabh.product.DAO;

import com.saurabh.product.dto.product;

public interface productDAO {
	void create(product product);
	product read(int id);
	void update(product product);
	void delete(int id);
	

}
