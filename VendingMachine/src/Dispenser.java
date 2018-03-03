
/** Project: DispenserClass
 * Summary: Source code for the Dispenser class
 * Class: CST-135
 * Date: February 24, 2018
 * Author: Phillip Radke
 */

public class Dispenser {

	private int penniesAvailable, nickelsAvailable, dimesAvailable, quartersAvailable, dollarsAvailable;
	private Product[] productsForSale;

	//no args constructor
	public Dispenser() {
		//Fill the Dispenser with cash
		this.penniesAvailable = 100;
		this.nickelsAvailable = 100;
		this.dimesAvailable = 100;
		this.quartersAvailable = 100;
		this.dollarsAvailable = 35;

		//Instantiate and fill the Product array
		productsForSale = new Product[5];

		productsForSale[0] = new Drink("Coke", 1.75, 16);
		productsForSale[1] = new Drink("Dr. Pepper", 1.75, 16);
		productsForSale[2] = new Candy("Snickers", 1.00, 7);
		productsForSale[3] = new Chips("Cheetos", 1.75, 15);
		productsForSale[4] = new Gum("Strident", "Spearmint", .75, 1);
	}

	public void setPenniesAvailable(int newAmount) {
		this.penniesAvailable = newAmount;
	}

	public void setNickelsAvailable(int newAmount) {
		this.nickelsAvailable = newAmount;
	}

	public void setDimesAvailable(int newAmount) {
		this.dimesAvailable = newAmount;
	}

	public void setQuartersAvailable(int newAmount) {
		this.quartersAvailable = newAmount;
	}

	public void setDollarsAvailable(int newAmount) {
		this.dollarsAvailable = newAmount;
	}

	//Calculate how much cash is available in the machine
	public double getCashOnHand() {
		double cash = this.dollarsAvailable;

		cash += this.penniesAvailable / 100;
		cash += (this.nickelsAvailable * 5) / 100;
		cash += (this.dimesAvailable * 10) / 100;
		cash += (this.quartersAvailable * 25) / 100;

		return cash;
	}

	public Product getProduct(int index) {
		return this.productsForSale[index];
	}

	public void displayProducts() {
		for (int i = 0; i < productsForSale.length; i++) {
			System.out.println(productsForSale[i].toString());
		}
	}
}
