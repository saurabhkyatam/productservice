package com.saurabh.product.DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import com.saurabh.product.dto.product;

public class productDAOImplTest {

	@Test
	public void creatshowIdCreateProduct() {
		
		productDAO dao= new productDAOImpl();
		product product =new product();
		product.setId(1);
		product.setName("samsung");
		product.setDescription("its asw phone lounch");
		product.setPrice(10000);
		
		dao.create(product);
		product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("samsung",result.getName());
	}

}
