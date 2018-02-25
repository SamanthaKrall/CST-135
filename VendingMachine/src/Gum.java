
/** Project: GumClass
 * Summary: Source code for the Gum subclass
 * Class: CST-135
 * Date: February 24, 2018
 * Author: Phillip Radke
 */


public class Gum extends Snack {
	
	private String flavor;
	//no args constructor
	public Gum () {}
	
	//constructor with args
	public Gum (String name, String flavor, double price, int weight) {
		this.name = name;
		this.flavor = flavor;
		this.price = price;
		this.weight = weight;
	}

	public String getFlavor () {
		return this.flavor;
	}
	
	public void setFlavor (String newFlavor) {
		this.flavor = newFlavor;
	}
	
	//override method for the equals method
	@Override
	public boolean equals(Object o) {
		// Check if the referenced object is of Snack type, then check if the fields are the same.
		if (o instanceof Gum) {
			return (name.equals(((Gum) o).name)) && 
				(flavor.equals(((Gum) o).flavor)) &&
				(price == ((Gum) o).price) &&
				(weight == ((Gum) o).weight) &&
				(this.getDateCreated().equals(((Gum) o).getDateCreated()));
		}
		else
			return this == o;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nFlavor: " + flavor + "\nPrice: " + super.currency.format(price) + "\nWeight: " + this.weight + " OZ";
	}
}
