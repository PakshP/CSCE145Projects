//Paksh Patel
import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//i is the height of the triangle
		int i;
		//j is the width of the triangle
		int j;
		
		//asking user to input height
		System.out.print("Enter Height of Triangle: ");
		//takes user input and stores into rows
		int rows = key.nextInt();
		
		//creates the increases portion of the triangle
		for (i = 0 ; i < rows; i++ ) 
		{
			for (j = 0 ; j <= i; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//creates the decreased portion of the triangle
		for (i = rows - 1; i >= 0; i-- ) 
		{
			for (j = 0 ; j <= i - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
