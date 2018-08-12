package com.org.shopingCart.expedia;

import com.org.shopingCart.expedia.products.Product;
import com.org.shopingCart.expedia.userCart.UserCart;

public class AppMain{
	public static void main(String[] args) {
		System.out.println("Case1");
		//case 1
		UserCart cart1 = new UserCart();
		Product p11=new Product("book",30.00);
		Product p12=new Product("chocolate",1.00);
		cart1.addItem(p11,  1);
		cart1.addItem(p12,  1);
		cart1.generateReceipt();
		
		//case 2
		System.out.println("\n----------Case2");
		UserCart cart2 = new UserCart();
		Product p21=new Product("bottle of wine",20.00);
		Product p22=new Product("box of headache pills",4.00);
		Product p23=new Product("box of pens",10.00);
		cart2.addItem(p21,  1);
		cart2.addItem(p22,  2);
		cart2.addItem(p23,  1);
		cart2.generateReceipt();
		
		
		//case 3
		System.out.println("\n----------Case3");
		UserCart cart3 = new UserCart();
		Product p31=new Product("pen",5.00);
		cart3.addItem(p31,  1);
		cart3.generateReceipt();
		
	}
}