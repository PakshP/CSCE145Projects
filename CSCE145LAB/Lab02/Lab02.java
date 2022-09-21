//Paksh Patel
import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of packages ordered:");
		int amount = key.nextInt();
		
		//calculation for cost before discount
		double total = amount * 99;
		
		//no such thing as ordering under 0 packages
		if (amount < 0) {
			System.out.println("Invalid value for package count! Exiting the program!");
		}
		
		//0-9 ordered
		if ((amount >= 0) && (amount <= 9)){
			int percent1 = 0;
			
			//calculation for discount and sub-total, repeated for each amount ordered
			double discount1 = total * percent1 / 100;
			double subtotal1 = total - discount1;
			
			//printed out to show the total, discount, and sub-total in dollars
			System.out.println("Total Purchase Amount (before discount) = $"+total);
			System.out.println("Amount of discount = $"+discount1);
			System.out.println("Total Purchase Amount (after discount) = $"+subtotal1);
		}
		
		//10-19 ordered
		if ((amount >= 10) && (amount <= 19)) {
			int percent2 = 20;
			double discount2 = total * percent2 / 100;
			double subtotal2 = total - discount2;
			System.out.println("Total Purchase Amount (before discount) = $"+total);
			System.out.println("Amount of discount = $"+discount2);
			System.out.println("Total Purchase Amount (after discount) = $"+subtotal2);
		}
		
		//20-49 ordered
		if ((amount >= 20) && (amount <= 49)) {
			int percent3 = 30;
			double discount3 = total * percent3 / 100;
			double subtotal3 = total - discount3;
			System.out.println("Total Purchase Amount (before discount) = $"+total);
			System.out.println("Amount of discount = $"+discount3);
			System.out.println("Total Purchase Amount (after discount) = $"+subtotal3);
		}
		
		//50-99 ordered
		if ((amount >= 50) && (amount <= 99)) {
			int percent4 = 40;
			double discount4 = total * percent4 / 100;
			double subtotal4 = total - discount4;
			System.out.println("Total Purchase Amount (before discount) = $"+total);
			System.out.println("Amount of discount = $"+discount4);
			System.out.println("Total Purchase Amount (after discount) = $"+subtotal4);
		}
		
		//more than 100 ordered
		if (amount >= 100) {
			int percent5 = 50;
			double discount5 = total * percent5 / 100;
			double subtotal5 = total - discount5;
			System.out.println("Total Purchase Amount (before discount) = $"+total);
			System.out.println("Amount of discount = $"+discount5);
			System.out.println("Total Purchase Amount (after discount) = $"+subtotal5);
		}
	
	}
}
