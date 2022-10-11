//Paksh Patel
import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//array initialization 
		double[] gasprice = new double[7];
		 	
		//for loop taking input to store in array
		for (int n = 0; n < 7; n++) {	
			System.out.println("Enter the gas price(per gallon) on Day "+(n+1)+":"+"\n");
			gasprice[n] = key.nextDouble();
			
			if (gasprice[n]<0) {
				System.out.print("Invalid value for price.");
				System.exit(0);
			}
			
		}			
		//variable for sum of all values
		Double sum = 0.00;
		
		//calculation for sum of all values
		for (int n = 0; n < 7; n++) {
			sum += gasprice[n];
		}
		
		//average calculation
		Double avg = sum/gasprice.length;
		
		double y = Math.round(avg * 100.0) / 100.0;
		
		System.out.println("\n"+"The average price for 1 gallon of gas during the last 7 days = $"+y);
		System.out.println("The price is above average on"+"\n");
		
		//finding values from array that are above avg
		for (int n = 0; n < gasprice.length; n++) {
			if(gasprice[n] > avg) {
				System.out.println("Days "+(n+1)+" : $"+gasprice[n]+"\n");
			}
		}
	}
}
