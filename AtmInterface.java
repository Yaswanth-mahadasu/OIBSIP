//import java.util.InputMismatchException;


import java.util.Scanner;
public class AtmInterface {
    public static void main(String[] args) {
        String username;
        String password;
        int balance = 10000;
        int withdraw;
        int deposit;
        int transfer;
        int transactions=0;
        String transactionHistory="";



        //For the login of the user with username and password
        //For reading the input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the details to Login--");

        System.out.println("Enter the username:");
        String Username = sc.nextLine();
        System.out.println("Enter the password:");
        String Password = sc.nextLine();
        if (Username.equals("srinivas") && (Password.equals("srinu"))) {
            System.out.println("Logged successfully");
        } else {
            System.out.println("Incorrect username and password");
        }
        System.out.println();

        while (true) {

            System.out.println("----Welcome to the Bank----");
            System.out.println(" 1 for Withdraw");
            System.out.println(" 2 for Deposit");
            System.out.println(" 3 for Transfer");
            System.out.println(" 4 for check balance");
            System.out.println(" 5 for EXIT");
            System.out.println("---Select the option you want to---");
            System.out.println();

            //Getting the choice from the user
            int UserChoice = sc.nextInt();

            //We can use the switch case to be performed the above operations
            switch (UserChoice) {

                case 1:
                    System.out.println("Enter the amount to withdraw:");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {

                        balance = balance - withdraw;

                        System.out.println("\nPlease collect your card and money");

                        System.out.println("Remaining balance is :"+balance);

                        System.out.println("TransactionHistory of withdrawn :"+withdraw);

                    } else {
                        System.out.println("\nInsufficient funds are available");
                    }
                    System.out.println();

                    break;

                case 2:
                    //If we deposit the money to our bank account
                    System.out.println("\nEnter the money to be deposited:");

                    deposit = sc.nextInt();

                    if (deposit<=balance) {

                        balance=deposit+balance;

                        System.out.println("\nYour money has been successfully deposited");

                        System.out.println("Remaining balance is :"+deposit);

                        String trans2="\tRs deposited - "+balance;

                        System.out.println("Transaction history of deposit :"+deposit);

                    } else {
                        System.out.println("\nEnter the minimum deposit balance to get deposited ");
                    }
                    System.out.println();

                    break;

                case 3:

                    System.out.println("Enter the amount you want to transfer :");

                    transfer = sc.nextInt();

                    if (transfer <=balance ) {

                        balance -= transfer;

                        System.out.println("\nyour money has been successfully transferred");

                        System.out.println("After transfer remaining balance is :"+balance);

                        String trans3="\tRs Transferred - "+balance;
                        System.out.println("Transaction history of Transfer :"+transfer);
                    }
                    System.out.println();

                    break;
                case 4:

                    //so the remaining and total balance will be displaying
                    System.out.println("\ntotal balance after all the transaction is:" + balance);

                    System.out.println();
                    break;
                case 5:
                  // EXIT MENU
                    System.out.println(0);
                    
            }


        }
    }
}
