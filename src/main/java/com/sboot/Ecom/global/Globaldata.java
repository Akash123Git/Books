package com.sboot.Ecom.global;

import java.util.ArrayList;
import java.util.List;

import com.sboot.Ecom.model.CartProduct;


public class Globaldata {

	public static List<CartProduct> cartProducts;
	
	static {
		cartProducts=new ArrayList<CartProduct>();
	}
}
