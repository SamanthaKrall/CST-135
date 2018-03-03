
/** Project: SnackClass
 * Summary: Source code for the Snack abstract subclass
 * Class: CST-135
 * Date: March 4, 2018
 * Author: Bug Smasher's group
 * compareTo method added
 * compareTo() internal code written by Samantha Krall, implemented by Phillip Radke
 */

import java.lang.Comparable;

public abstract class Snack extends Product implements Comparable<Snack> {
	//no args constructor
	public Snack() {}
	
	public Snack(String name, double price, int weight) {
		super(name, price, weight);
	}
	
	//Cretes a copy of another Snack
	public Snack (Snack s) {
		this.name = s.name;
		this.price = s.price;
		this.weight = s.weight;
		this.dateCreated = s.getDateCreated();
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
	
	// return of 1 means this snack comes before the compared snack
	// return of 0 means the two are equal
	// return of -1 means this snack comes after the compared snack
	public int compareTo(Snack snack) {
		if (this.name.charAt(0) > snack.name.charAt(0)) {
			return 1;
		} else if (this.name.charAt(0) < snack.name.charAt(0)) {
			return -1;
		} else if (this.price > snack.price) {
			return 1;
		} else if (this.price < snack.price) {
			return -1;
		} else {
			return 0;
		}
	}
}
