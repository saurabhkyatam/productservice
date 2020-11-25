package com.saurabh.productBo;

import com.saurabh.product.dto.product;

public interface productBO {
	public void create(product product);
	public product findProduct(int Id);

}
