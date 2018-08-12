package com.org.shopingCart.expedia.products;

/**
 * Author: Ravi Kant 
 */
public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
		public int hashCode(){
		    return this.getName().length();
		}
	
	/**
	 * Two products are equal if there name and price are equal. 
	 */
	@Override
	public boolean equals(Object ob){
		Product p=(Product)ob;
		if(this.getName().equalsIgnoreCase(p.getName()) && this.getPrice().doubleValue()==p.getPrice().doubleValue())
			return true;
		return false;
	}
}
