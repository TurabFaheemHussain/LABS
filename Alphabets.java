package scd;

import java.util.Scanner;
public class Alphabets extends Thread {
	private boolean run = true;
	public void stopThread() {
		run = false;
	}
	public void run() {
		for(int i=0; i<26 && run; i++) {
			int random_no = 65 + (int)(Math.random()*26);
			char letter = (char)random_no;
			System.out.println("Letter::" + letter + "");
			try {
				Thread.sleep((int)(Math.random()*400)+100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		System.out.println("\n Thread Finshed");
	}
	public static void main(String[] args) {
		Alphabets thread = new Alphabets();
		System.out.println("Starting Thread...");
		thread.start();
		try {
			thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
	}
		System.out.println("\n Stopping Thread...");
		thread.stopThread();
		}
	}

