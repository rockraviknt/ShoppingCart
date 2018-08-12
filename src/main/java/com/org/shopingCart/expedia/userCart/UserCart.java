package com.org.shopingCart.expedia.userCart;

import java.util.LinkedHashMap;
import java.util.Map;
import com.org.shopingCart.expedia.products.Product;
import com.org.shopingCart.expedia.utility.ShoppingUtility;


/**
 * Author: Ravi Kant
 * 
 * This class prints out the details of a receipt containing products purchased by a user.
 */
public class UserCart {
	Map<Product, Integer> items;

	/**
	 * Initializing User Cart. 
	 */
	public UserCart() {
		items = new LinkedHashMap<Product, Integer>();
	}
	
	/**
	 * Adding items and its quantity to user cart. 
	 */
	public void addItem(Product product, Integer quantity) {
	    if(quantity > 0)
	    	items.put(product, quantity);
		else
		 	throw new RuntimeException();
	}

	/**
	 * Removing an item from user cart. 
	 */
	public void removeItem(Product product) {
	    if(items.containsKey(product))
	    	items.remove(product);
		else
			throw new RuntimeException();

	}
    
	/**
	 * Generating receipt. 
	 */
	public void generateReceipt() {
	    double total = 0;
	    double totTaxAmt=0;
	    double itemTax=0;
	    double amt=0;
		for(Map.Entry<Product, Integer> entry :  items.entrySet()){
			amt=entry.getKey().getPrice()*entry.getValue();             // item_price * quantity_of_item
			
			// Getting product type (Medical or Non_Medical) for calculating sales tax
			String type=ShoppingUtility.checkProductType(entry.getKey()); 
			itemTax=ShoppingUtility.calculateSalesTax(amt, type);        // Calculating sales tax for each item
			
			amt=amt+itemTax;                                             // Actual amount for product= amount of product + sales tax
			total = total + amt;                                        
			totTaxAmt=totTaxAmt + itemTax;                               // Total sales tax paid by the user
			
		    System.out.println(entry.getValue()+ " " + entry.getKey().getName()  + ": " + ShoppingUtility.formatAmount(amt));
		}
		System.out.println("Sales Taxes: " + ShoppingUtility.formatAmount((totTaxAmt)));
		System.out.println("Total: " + ShoppingUtility.formatAmount((total)));
	}

	/**
	 * Getting user cart size. 
	 */
	public int getCartSize() {
		return items.size();
	}

}
