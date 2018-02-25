/** Project: DrinkClass
 * Summary: Source code for the Drink subclass
 * Class: CST-135
 * Date: February 24, 2018
 * Author: Samantha Krall
 * Alterations made: Moved class out of the Main class and made the class its own class
 *	Changed name conventions and format to match the rest of the project
 *	Removed unnecessary get and set methods for compatibility with superclass
 *	Added the equals override method
 * Altered by: Phillip Radke
 */

public class Drink extends Product {

	public Drink () {
		super();
	}

	public Drink (String nameNew, double priceNew, int ouncesNew) {
		this.name = nameNew;
		this.price = priceNew;
		this.weight = ouncesNew;
	}
	
	//Cretes a copy of another Drink
	public Drink (Drink d) {
		this.name = d.name;
		this.price = d.price;
		this.weight = d.weight;
		this.dateCreated = d.getDateCreated();
	}
	
	//override method for the equals method
	@Override
	public boolean equals (Object o) {
		// Check if the referenced object is of Snack type, then check if the fields are the same.
		if (o instanceof Product) {
			return (name.equals(((Product) o).name)) && 
				(price == ((Product) o).price) &&
				(weight == ((Product) o).weight) &&
				(this.getDateCreated().equals(((Product)o).getDateCreated()));
		} else {
			return this == o;
		}
	}

	//override method for the toString method
	public String toString () {
		return "Name: " + name + "\nPrice: " + super.currency.format(price) + "\nWeight: " + this.weight + " FL OZ";
	}
}
