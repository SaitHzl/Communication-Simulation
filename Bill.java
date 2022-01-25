
package question;

public class Bill {

	private double limitingAmount;
	private double currentDebt;
	double totalMoneySpent = 0;
	public Bill(double limitingAmount) {
		this.limitingAmount = limitingAmount;
		this.currentDebt = 0;
	}
	
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
	
	double getCurrentDebt() {
		return currentDebt;
	}
	

}

