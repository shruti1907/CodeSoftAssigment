package Task3;

import java.util.Scanner;



//import Task3.BankAccount;
//import Task3.Main;

//import ATM_Interface.BankAccount;
//import ATM_Interface.Main;

public class ATM extends Main {
  private BankAccount account;

  public ATM(BankAccount account) {
      this.account = account;
  }

  public void displayOptions() {
      System.out.println("Welcome to the ATM!");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
  }

  public void run() {
      Scanner scanner = new Scanner(System.in);

      while (true) {
          displayOptions();
          System.out.print("Please select an option: ");
          int choice = scanner.nextInt();

          switch (choice) {
              case 1:
                  System.out.println("Current balance: $" + account.getBalance());
                  break;
              case 2:
                  System.out.print("Enter the deposit amount: $");
                  double depositAmount = scanner.nextDouble();
                  account.deposit(depositAmount);
                  break;
              case 3:
                  System.out.print("Enter the withdrawal amount: $");
                  double withdrawalAmount = scanner.nextDouble();
                  account.withdraw(withdrawalAmount);
                  break;
              case 4:
                  System.out.println("Thank you for using the ATM. Goodbye!");
                  return;
              default:
                  System.out.println("Invalid option. Please try again.");
                  break;
          }
      }
  }
}


