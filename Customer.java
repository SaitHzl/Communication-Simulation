
package question;

public class Customer {
	
	private int ID;
	String name;
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
		this.bill = new Bill(limitingAmount);
	}
		
	//Actions that a customer can take
	
	void talk(int minute, Customer other) {
		if((this.bill.check(this.operator.calculateTalkingCost(minute,Customer.this)))) {
			this.bill.add(this.operator.calculateTalkingCost(minute,Customer.this));
			talkingTime+=minute;
			this.operator.operatorTalkingTime += minute;
			other.getOperator().operatorTalkingTime += minute;
			other.talkingTime+=minute;

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
	
	int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}

