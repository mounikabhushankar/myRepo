package Project;

import java.util.Scanner;

public class Operations {
	
	static double balance=50000.00;
	static double withdraw;
	static double deposit;
	static Scanner sc=new Scanner(System.in);
	public static void checkBalance() {
		System.out.println(balance);
		}
	
	void withdraw(double amount) {
		System.out.println("enter amount to withdraw:");
		double w=sc.nextDouble();
		if(w>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance-=w;
			System.out.println("Withdraw Successfull");
		}
	}
	
	void deposit(double deposit) {
		System.out.println("enter amount to deposit:");
		
		double depo=sc.nextDouble();
		balance+=depo;
		System.out.println("Deposit Successfull");
		
		}
	
	void exit() {
		System.out.println("Exit...");
	}
	

	public static void main(String[] args) {
		while(true) {
		
		System.out.println("select your option");
		System.out.println("1. CheckBalance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		
		int d=sc.nextInt();
		
		Operations o=new Operations();
		Operations o1=new Operations();
		Operations o2=new Operations();
		
		switch(d){
			case 1: System.out.println("your current balance:");
			        checkBalance() ;
			        break;
			       
		    case 2: o.withdraw(d);
			        System.out.println("");
			        break;
			        
			case 3: o1.deposit(d);
			        break;
			        
			default: o2.exit();
		}
	}

}
}
