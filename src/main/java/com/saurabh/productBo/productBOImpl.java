package com.saurabh.productBo;

import com.saurabh.product.DAO.productDAO;
import com.saurabh.product.dto.product;

public class productBOImpl implements productBO {

		private productDAO dao;
	@Override
	public void create(product product) {
		// TODO Auto-generated method stub
		dao.create(product);

	}

	@Override
	public product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public productDAO getDao() {
		return dao;
	}

	public void setDao(productDAO dao) {
		this.dao = dao;
	}

}
