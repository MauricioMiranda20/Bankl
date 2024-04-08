package entities;

public class Account {
	private int number;
	private String holder;
	protected double balancer;
	
	
	public Account() {
	}

	public Account(int number, String holder, double balancer) {
		this.number = number;
		this.holder = holder;
		this.balancer = balancer;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalancer() {
		return balancer;
	}

	public void setBalancer(double balancer) {
		this.balancer = balancer;
	}

	public void withdraw(double amount) {
		balancer -= amount;
	}
	
	public void deposit(double amount) {
		balancer += amount;
	}
	
}
