
package question;

public class Customer {
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	
	private int ID;
	private String name;
	private int age;
	private Operator operator;
	private Bill bill;
	int talkingTime;
	int nOfMessages;
	double connectionAmount;
	
	public Customer(int ID, String name, int age, Operator operator, double limitingAmount) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.operator = operator;
		limitingAmount = bill.getLimitingAmount();
		this.bill = new Bill(limitingAmount);
		
	}
		
	//Actions that a customer can take
	void talk(int minute, Customer other) {
		if((this.bill.check(this.operator.calculateTalkingCost(minute,Customer.this)))) {
			this.bill.add(this.operator.calculateTalkingCost(minute,Customer.this));
			talkingTime+=minute;
			this.operator.operatorTalkingTime += minute;

		}
		
	}
	void message(int quantity, Customer other) {
		if(this.bill.check(this.operator.calculateMessageCost(quantity, Customer.this, other))) {
			this.bill.add(this.operator.calculateMessageCost(quantity, Customer.this, other));
			nOfMessages+=quantity; //customer'In ne kadar mesaj attýðýný depolar
			this.operator.operatornOfMessagesSent+=quantity; // operator vasýtasýyla kaç mesaj atýldýðýný depolar
		}
	

	}
	void connection(double amount) {
		if(this.bill.check(this.operator.calculateNetworkCost(amount))) {
			this.bill.add(this.operator.calculateNetworkCost(amount));
			connectionAmount+=amount;
			this.operator.operatorInternetUsage+=amount;
		}
		
	}
	
	//getter method for age
	int getAge() {
		return age;
	}
	//setter method for age
	public void setAge(int age) {
		this.age = age;
	}
	//getter method for operator
	public Operator getOperator() {
		return operator;
	}
	//setter method for operator
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	//getter method for bill
	public Bill getBill() {
		return bill;
	}
	//setter method for Bill
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

