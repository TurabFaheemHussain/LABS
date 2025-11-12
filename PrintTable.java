package scd;

public class PrintTable extends Thread {
		int number;
		String name;
		public PrintTable(int number, String name) {
			this.number = number;
			this.name = name;
		}
		public void run() {
			System.out.println("Table of" + number + ":");
			for(int i=1; i<=10; i++) {
				System.out.println(name+ ":" + number + "x" + i + "=" + (number*i) );
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}}}
		public static void main(String[] args) {
			PrintTable rollNumber = new PrintTable(127, "Roll Number:");
			PrintTable dob = new PrintTable(1, "Date of birth:");
			rollNumber.start();
			dob.start();
		}
}
		

