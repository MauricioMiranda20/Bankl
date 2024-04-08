package heranca;

import entities.BusinessAccount;

public class Main {

	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount(8010,"Bob Brown",0,500);
		account.loan(2);
		System.out.println(account.getBalancer());

	}

}
