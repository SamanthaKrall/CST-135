/** Project: ProductClass
 * Summary: Source code for the product superclass
 * Class: CST-135
 * Date: February 22, 2018
 * Author: Tim James
 * Alterations made: reorganized and renamed some variables for uniformity and compatibility across the project
 *	Changed name conventions and format to match the rest of the project
 *	
 * Altered by: Phillip Radke
 */

import java.text.DecimalFormat;
import java.util.Date;

public abstract class Product {
	// Declare instance variables

	protected String name; // product name
	protected double price; // product price
	protected int weight; //weight of the product
	protected DecimalFormat currency = new DecimalFormat("0.00"); // Format Currency
	private Date dateCreated; // date of product creation

	// Declare empty constructor
	public Product() {
		dateCreated = new java.util.Date();
	}

	// Declare Product constructor that accepts paremeters name and price
	public Product(String nameIn, double priceIn, int weightIn) {
		dateCreated = new Date(); // assigns date when created
		name = nameIn; // assigns the value of nameIn to the name class instance variable
		price = priceIn; // assigns the value priceIn to the price class instance variable
		weight = weightIn; // assign the value to instanced weight variable
	}

	// Set name of product
	public void setName(String nameIn) {
		this.name = nameIn;
	}

	// Return name of product
	public String getName() {
		return this.name;
	}

	// Set price of product
	public void setPrice(double priceIn) {
		this.price = priceIn;
	}
	
	// Set weight of product
	public void setWeight(int weightIn) {
		this.weight = weightIn;
	}
	
	// Return weight of product
	public int getWeight() {
		return this.weight;
	}

	// Return price of product
	public double getPrice() {
		return this.price;
	}

	// Get date created
	public Date getDateCreated() {
		return dateCreated;
	}

	// Display product info to the console
	@Override
	public String toString() {
		return "Product: " + name + "\nPrice: $" + currency.format(price)
			  + "\nCreated: " + dateCreated;
	}
}
