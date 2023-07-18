package basic_section5_1;

public class BestCustomer extends Customer{

	
	private int agentID;
	double salesRatio;
	
	public BestCustomer(int customerId, String customerName) {
		super(customerId,customerName);
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}


	public int getAgentId() {
		return agentID;
	}



	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 아이디는 " + agentID;
	}
	
	
	
	
}
