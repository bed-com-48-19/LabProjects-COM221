import java.util.*;

public class BankingApp{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = input.nextLine();

        System.out.print("enter your ID");
        String id = input.nextLine();

        // now lets create an object that will connect the two classes
        BankAccount chifuniro = new BankAccount(name, id);
        chifuniro.showMenu();
    }
}