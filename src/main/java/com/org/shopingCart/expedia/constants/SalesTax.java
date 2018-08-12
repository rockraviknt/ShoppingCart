package com.org.shopingCart.expedia.constants;

import java.util.HashMap;
import java.util.Map;


public enum SalesTax {
	/**
	 * Defining two product types Medical and Non-Medical. 
	 */
	MEDICAL(0), OTHER(20);
	
	private int taxRate;
	
	SalesTax(int rate){
		taxRate=rate;
	}
	
	/**
	 * Cache variable to store enum values. 
	 */
	private static final Map<String, Integer> cacheSalesTaxMap = new HashMap<String, Integer>();

	static {
		for (SalesTax st : SalesTax.values()) {
			cacheSalesTaxMap.put(st.name(), st.taxRate);
		}
	}

	/**
	 * Method to retrieve SalesTax based on key
	 * @param SalesTax
	 * @return
	 */
	public static int getTaxRate(String type) {
		return cacheSalesTaxMap.get(type);
	}
	
}
