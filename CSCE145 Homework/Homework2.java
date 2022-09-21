//Paksh Patel
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome, Joe! You are using the Compound Interest Calculator.");
        System.out.println("Enter the principal amount originally deposited into your account.");

        //user set amount of money
        int principalAmount = key.nextInt();
        if (principalAmount <= 0) {
            System.out.println("Invalid input entered. Exiting the program!");
            return;
        }
        
        System.out.println("What is the annual interest rate for this account?");
        //user set amount of interest
        float interestRate = key.nextFloat();
        if (interestRate <= 0) {
            System.out.println("Invalid input entered. Exiting the program!");
            return;
        }

        System.out.println("Enter the number of times that interest rate compounded? " +
                "For example, if interest rate is compounded monthly, enter 12. If interest rate is compounded quarterly, enter 4.");
        //user set amount of times to compound
        int compounded = key.nextInt();
        if (compounded <= 0) {
            System.out.println("Invalid input entered. Exiting the program!");
            return;
        }

        System.out.println("How many years will you plan to let this account near interest?");
        //user set amount of years to keep money
        int years = key.nextInt();
        if (years <= 1) {
            System.out.println("Invalid input entered. Exiting the program!");
            return;
        }
        
        //calculations for amount in savings after certain years, with interest, and compounding
        double totalSavings = principalAmount * Math.pow((1 + (interestRate / compounded)), (compounded * years));
        totalSavings = Math.round(totalSavings * 100.0) / 100.0;
        
        
        System.out.println("The total amount in your savings account after "+years+" years will be $" + totalSavings);

    }
		
}
