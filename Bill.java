
package question;

public class Bill {

	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	private double limitingAmount;
	private double currentDebt;
	public Bill(double limitingAmount) {
		this.limitingAmount = limitingAmount;
		this.currentDebt = 0;
	}
	
	//Getter method for limitingAmount
	double getLimitingAmount() {
		return limitingAmount;
	}
	
	//checking if we exceed the limiting amount
	boolean check(double amount) {
		if (currentDebt > limitingAmount) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//adding parameter amount to current debt
	void add(double amount) {
		currentDebt += amount;
		
	}
	
	//paying bills
	void pay(double amount) {
		currentDebt -= amount;
	}
	
	// getter method for currentDebt
	double currentDebt() {
		return currentDebt;
	}
	


	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

