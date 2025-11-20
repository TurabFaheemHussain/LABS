package scd;
public class Account {
		public static void main(String[] args) {
					Accounts bankAcc = new Accounts();
					UserThread acc_holder1 = new UserThread(bankAcc, "Turab", 45000);
					UserThread acc_holder2 = new UserThread(bankAcc, "Hussain", 20000);
					acc_holder1.start();
					acc_holder2.start();
					}
		}
class Accounts {
			private int balance =50000;
			public synchronized void withdraw(String name, double amount) {
				if(balance >= amount) {
					System.out.println(name + " Withdraw " + amount);
					balance -= amount;
					System.out.println("Remaining Balance: " + balance);
				}else {
					System.out.println("Insufficient Balance For:" + name);	
					}
				}
		}
		class UserThread extends Thread{
			private Accounts Acc;
			private String name;
			private double amount;
			public UserThread(Accounts Acc, String name, double amount) {
				this.Acc = Acc;
				this.name = name;
				this.amount = amount;
			}
			 public void run(){
				Acc.withdraw(name , amount);
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


