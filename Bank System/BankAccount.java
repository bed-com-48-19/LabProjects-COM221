import java.util.*;

public class BankAccount {
    double balance =10000; // currently assume the account has that much;
    double previousTransactional;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    public void deposits(double amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransactional = amount;
        }
    }

    public void withdraw(double amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransactional = amount;
        }
    }

    public void getpreviousTransactional(){
        if(previousTransactional > 0){
            System.out.println("Deposited:" + previousTransactional);
        }
        else if(previousTransactional < 0){
            System.out.println("withdrawn:" + previousTransactional);
        }
        else{
            System.out.println("no transaction occured");
        }
    }
    public void createAccount(String name, String address, double amount){
       System.out.println("Yeiii account created "); 
    }
    public void showMenu(){
         System.out.println("Welcome to the Bank Management system");

        System.out.println("Main menu\n___________________________ " +
                "\nchoose the transaction below\n" +
                " 1. List All Account a" +
                "and their Balances\n 2. Create a new Account\n" +
                " 3. Deposit Money into Account\n 4. Withdraw money from Account\n " +
                "5. Check Account Balance\n 6. Exit\n  ");
                 Scanner input = new Scanner(System.in);
                System.out.print("Enter your choice here_ _"  );
                
                  int choice;
                do {
                    
                choice = input.nextInt();
                    
        System.out.println("\n");
        switch (choice){
            case 1: System.out.print("1. Account Number \n 2. AccountName \n 3. Type \n 4. Branch \n 5. Balance");
            break;
            case 2: System.out.println("Select Bank type \n 1. Student \n 2. Executive");
                    System.out.println("to create an account you need to provide your name\n address \n and at least MKW200 to register");
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your Address");
                    String address = input.nextLine();
                    System.out.print("Enter at least a sum of MKW200 to register ");
                    double amount = input.nextDouble();
                    createAccount(name,address,amount);
            break;
            case 3: System.out.print("deposit money into account ");
                    System.out.println("Enter the amount to be deposited ");
                    amount = input.nextDouble();
                    deposits(amount);
                    System.out.println("\n");
            break;
            case 4: System.out.print("withdraw money into the account ");
                    System.out.println("Enter the amount to be withdrawned: ");
                    double am = input.nextDouble();
                    withdraw(am);
                    System.out.println("\n");
            break;
            case 5: System.out.print("check Account Balance ");
                    getpreviousTransactional();
                    System.out.println("\n");
            break;
            default:
                   System.out.println("Invalid option! Try again...");
                } 
    } while(choice != 6);
            System.out.println("*****Thank you for using our system*******");
 }
}