package com.org.shopingCart.expedia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.org.shopingCart.expedia.products.Product;
import com.org.shopingCart.expedia.userCart.UserCart;


/**
 * Unit test for Shopping Cart App.
 */

public class UserCartTest {
	private Product p1;
	private Product p2;
	private UserCart cart1;
	
	@Before
	public void setup() {
		cart1 = new UserCart();
		p1=new Product("book",30.00);
		p2=new Product("chocolate",1.00);
	}
	@Test
	public void initializeProductTest(){	
		Assert.assertNotNull(p1.getName());
		Assert.assertNotNull(p1.getPrice());
		Assert.assertNotNull(p2.getName());
		Assert.assertNotNull(p2.getPrice());
		
	}
	
	@Test
	public void addItemTest() {
		int size=cart1.getCartSize();
		cart1.addItem(p1, 1);
		cart1.addItem(p2, 1);
		int newSize=cart1.getCartSize();
		Assert.assertEquals(size+2, newSize);
	}
	
	@Test
	public void removeItemTest() {
		cart1.addItem(p1, 1);
		cart1.addItem(p2, 1);
		int size=cart1.getCartSize();
		cart1.removeItem(p1);
		int newSize=cart1.getCartSize();
		Assert.assertEquals(size - 1,newSize);
	}
    
	@Test(expected=RuntimeException.class)
	public void addItemExceptionTest(){
		Product p3=new Product("QuantityZero",1.00);
		cart1.addItem(p3, 0);
	}
}
