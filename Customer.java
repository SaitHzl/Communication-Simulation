
package question;

public class Customer {
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	private int ID;
	private String name;
	private int age;
	private Operator operator;
	private Bill bill;
	public Customer(int ID, String name, int age, Operator operator, double limitingAmount) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.operator = operator;
		limitingAmount = bill.getLimitingAmount(); 
		
	}
	//Actions that a customer can take
	void talk(int minute, Customer other) {
		
		
	}
	void message(int quantity, Customer other) {
	

	}
	void connection(double amount) {
		
	}
	
	//getter method for age
	int getAge() {
		return age;
	}
	
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

