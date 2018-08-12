package com.org.shopingCart.expedia.utility;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.org.shopingCart.expedia.constants.SalesTax;
import com.org.shopingCart.expedia.products.Product;

/**
 * Author: Ravi Kant 
 * 
 * This is Utility class, it contains useful utility methods for User cart processing.
 */
public class ShoppingUtility{
	final static DecimalFormat df = new DecimalFormat("#.00");
	
	/**
	 * This method is formating double value upto two decimal places. 
	 */
	public static String formatAmount(double amt) {
		return df.format(amt);
	}
	
	/**
	 * This method is calculating sales tax according to given item type. 
	 */
	public static double calculateSalesTax(double amt, String type) {
		double tax=0;
		tax = (amt * SalesTax.getTaxRate(type))/100;
		return tax;
	}
	
	/**
	 * This method is determining product type. 
	 */
	public static String checkProductType(Product product) {
		String type="OTHER";
		Pattern p = Pattern.compile("(pills)");
		Matcher matcher = p.matcher(product.getName().toLowerCase().trim());
		if(matcher.find())
			type= "MEDICAL";
		
		return type;
	}

}
