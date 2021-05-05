
package question;

public class Bill {

	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	private double limitingAmount;
	private double currentDebt;
	double totalMoneySpent = 0;
	public Bill(double limitingAmount) {
		this.limitingAmount = limitingAmount;
		this.currentDebt = 0;
	}
	
	//Getter method for limitingAmount
	double getLimitingAmount() {
		return limitingAmount;
	}
	void changeTheLimit(double amount) {
		limitingAmount = amount;
	}
	//checking if we exceed the limiting amount
	boolean check(double amount) {
		//if we exceed the limitingAmount return false
		if (currentDebt + amount > limitingAmount) {
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
		if (amount>=currentDebt) {
			totalMoneySpent+=currentDebt;
			currentDebt=0;
		}
		else {
			currentDebt = currentDebt - amount;
			totalMoneySpent+=amount;
		}
	}
	
	// getter method for currentDebt
	double getCurrentDebt() {
		return currentDebt;
	}
	


	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

