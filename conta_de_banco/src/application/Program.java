package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
      Account y = new Account(1023, "Ilan", 1000.0);
      Account x = new SavingsAccount(1023, "luis", 1000.0, 0.01);
      
      y.withdraw(50.0);
      x.withdraw(50.0);
      System.out.println(x);
      System.out.println(y);

 }
}