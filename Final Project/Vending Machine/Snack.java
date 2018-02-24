
/** Project: SnackClass
 * Summary: Source code for the Snack abstract subclass
 * Class: CST-135
 * Date: February 24, 2018
 * Author: Phillip Radke
 */

public abstract class Snack extends Product {
	//no args constructor
	public Snack() {}
	
	public Snack(String name, double price, int weight) {
		super(name, price, weight);
	}
	
	//override method for the equals method
	@Override
	public boolean equals(Object o) {
		// Check if the referenced object is of Snack type, then check if the fields are the same.
		if (o instanceof Snack) {
			return (name.equals(((Snack) o).name)) && 
				(price == ((Snack) o).price) &&
				(weight == ((Snack) o).weight) &&
				(this.getDateCreated().equals(((Snack) o).getDateCreated()));
		}
		else
			return this == o;
	}
	
	//override method for the toString method
	@Override
	public String toString() {
		return "Name: " + name + "\nPrice: " + super.currency.format(price) + "\nWeight: " + this.weight + " OZ";
	}
}
