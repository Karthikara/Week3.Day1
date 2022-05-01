package org.bank;

public class AxisBank extends BankInfo{
public void deposit() {
	System.out.println("DA is 500");
}
public static void main(String[] args) {
	BankInfo info=new BankInfo();
	info.savings();
	info.deposit();
	info.fixed();
	AxisBank da = new AxisBank();
	da.deposit();
	
}
}
