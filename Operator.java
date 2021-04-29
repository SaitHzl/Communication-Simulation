
package question;

public class Operator {
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	private int ID;
	private double talkingCharge;
	private double messageCost;
	private double networkCharge;
	private int discountRate;
	public Operator(int ID, double talkingCharge, double messageCost, double networkCharge, int discountRate) {
		this.ID = ID;
		this.talkingCharge = talkingCharge;
		this.messageCost = messageCost;
		this.networkCharge = networkCharge;
		this.discountRate = discountRate;
	}
	double caculateTalkingCost(int minute, Customer customer) {
		return minute;
	}
	double calculateNetworkCost(double amount) {
		
	}
	double calculateMessageCost(int quantity, Customer customer, Customer other) {
		
	}
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
}

