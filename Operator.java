
package question;

public class Operator {
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	
	private int ID;
	private double talkingCharge;
	private double messageCost;
	private double networkCharge;
	private int discountRate;
	int operatorTalkingTime;
	int operatornOfMessagesSent;
	double operatorInternetUsage;
	public Operator(int ID, double talkingCharge, double messageCost, double networkCharge, int discountRate) {
		this.ID = ID;
		this.talkingCharge = talkingCharge;
		this.messageCost = messageCost;
		this.networkCharge = networkCharge;
		this.discountRate = discountRate;
	}
	
	double calculateTalkingCost(int minute, Customer customer) {
		if(customer.getAge()<18 || customer.getAge()>65) {
		return (minute* (customer.getOperator().talkingCharge)) - ((minute*(customer.getOperator().talkingCharge)) * (customer.getOperator().discountRate)/100);
		
		}
		else {
			return (minute*customer.getOperator().talkingCharge);
		}
		
	}
	
	double calculateNetworkCost(double amount) {
		return amount * networkCharge;
	}
	
	double calculateMessageCost(int quantity, Customer customer, Customer other) {
		if(customer.getOperator().ID == other.getOperator().ID) {
			return ((quantity*(customer.getOperator().messageCost)) - ((quantity*customer.getOperator().messageCost)*(customer.getOperator().discountRate)/100));
		}
		else {
			return (quantity*customer.getOperator().messageCost);
		}
		
	}
	
	public double getTalkingCharge() {
		return talkingCharge;
	}
	public void setTalkingCharge(double talkingCharge) {
		this.talkingCharge = talkingCharge;
	}
	
	public double getMessageCost() {
		return messageCost;
	}
	public void setMessageCost(double messageCost) {
		this.messageCost = messageCost;
	}
	public double getNetworkCharge() {
		return networkCharge;
	}
	public void setNetworkCharge(double networkCharge) {
		this.networkCharge = networkCharge;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

