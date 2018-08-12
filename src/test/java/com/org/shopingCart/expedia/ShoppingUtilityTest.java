package com.org.shopingCart.expedia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.org.shopingCart.expedia.products.Product;
import com.org.shopingCart.expedia.utility.ShoppingUtility;

public class ShoppingUtilityTest {
	private Product p1;
	@Before
	public void setup() {
		p1=new Product("book",30.00);
	}
	
	@Test
	public void calculateMedicalProdTypeSalesTax(){
		Assert.assertEquals(0,ShoppingUtility.calculateSalesTax(20, "MEDICAL"),0.00);
	}
	
	@Test
	public void calculateOtherProdTypeSalesTax(){
		Assert.assertEquals(2,ShoppingUtility.calculateSalesTax(10, "OTHER"),0.00);
	}
	
	@Test
	public void formatAmountTest() {
		Assert.assertEquals("3.46",ShoppingUtility.formatAmount(3.45673));
	}
	
	@Test
	public void checkProductTypeTest() {
		Assert.assertEquals("OTHER",ShoppingUtility.checkProductType(p1));
	}
	
}
