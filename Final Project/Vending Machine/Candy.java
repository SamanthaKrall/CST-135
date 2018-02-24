/** Project: CandyClass
 * Summary: Source code for the Drink subclass
 * Class: CST-135
 * Date: February 24, 2018
 * Author: Samantha Krall
 * Alterations made: Moved class out of the Main class and made the class its own class
 *	Changed name conventions and format to match the rest of the project
 *	Removed unnecessary get and set methods for compatibility with superclass
 *	Added the equals override method
 *	Added no args constructor
 * Altered by: Phillip Radke
 */

public class Candy extends Snack {
	
	public Candy () {
		super();
	}

	public Candy(String name, double price, int weight) {
		super(name, price, weight);
//		this.name = name;
//		this.price = price;
//		this.weight = weight;
	}

//	public void setName(String nameNew) {
//		this.name = nameNew;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public double getPrice() {
//		return this.price;
//	}
	
	//override method for the equals method
	@Override
	public boolean equals (Object o) {
		// Check if the referenced object is of Snack type, then check if the fields are the same.
		if (o instanceof Candy) {
			return (name.equals(((Candy) o).name)) && 
				(price == ((Candy) o).price) &&
				(weight == ((Candy) o).weight) &&
				(this.getDateCreated().equals(((Candy)o).getDateCreated()));
		} else {
			return this == o;
		}
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nPrice: " + super.currency.format(price) + "\nWeight: " + this.weight + " OZ";
	}
}
