package entities;

public class BusinessAccount extends Account{
	
	private double loadLimit;
	
	

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int number, String holder, double balancer, double loadLimit) {
		super(number, holder, balancer);
		this.loadLimit = loadLimit;
	}

	public double getLoadLimit() {
		return loadLimit;
	}

	public void setLoadLimit(double loadLimit) {
		this.loadLimit = loadLimit;
	}
	

	public void loan(double amount) {
		if(amount <= loadLimit) {
			balancer += amount * 10;
		}
	}
	
	
}
