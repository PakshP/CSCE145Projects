//Paksh Patel
import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//asking use for the amount of me
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
        int userMoney = key.nextInt();

        //declaring variables
        int chocoBars = 0;
        int userCoupon = 0;     

        chocoBars =+ userMoney;

        //states that if when 6 bars are purchased 1 coupon is given
        if (userMoney >= 6) {
            chocoBars = chocoBars + (userMoney / 6);
            userCoupon = userMoney / 6;
        }

        while (userCoupon >= 6) {
            chocoBars = chocoBars + 1;
            userCoupon = userCoupon - 6;
        }
        
        //invalidates negative numbers
        if (userMoney < 0) {
        	System.out.println("Invalid value for amount! Exiting the program!");
        }
        else {
        	System.out.println("You can buy " +chocoBars+ " chocolate bars and will have " +userCoupon+ " coupons left!");
        }

        
	}

}
