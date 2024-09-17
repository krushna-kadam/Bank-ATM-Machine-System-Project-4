package com.atmmachine;

import java.util.Scanner;

class ATM {

	float Balance;
	int PIN =5787;

	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		Integer enteredpin = sc.nextInt();
		if (enteredpin == PIN) {
			menu();
		} else {
			System.err.println("Enter a valid pin");
			menu();
		}
	}

	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw  Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT ");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} 
		else if (opt == 2) {
			withdrawMoney();
		}
		else if (opt == 3) {
			depositMoney();
		} 
		else if (opt == 4) {
		
			return;
		} 
		else {
			System.err.println("Enter a valid Choice! ");
		}

	}

	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.err.println("Insufficient Balance Fund!");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawl Successfully...");
		}
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter The Amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Successfully...");
		
		menu();

	}

}

public class ATM_Machine {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.checkpin();

	}
}
