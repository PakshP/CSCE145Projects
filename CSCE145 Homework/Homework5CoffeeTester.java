//Paksh Patel

import java.util.Scanner;

public class Homework5CoffeeTester {
	
	public static void main(String[] args) {
		
		//variables created from the coffee class
		Homework5Coffee coffee1 = new Homework5Coffee();
		Homework5Coffee coffee2 = new Homework5Coffee();
	
		//variable created to store the caffeine content 
		String name ;
		int caffeine;
		
		Scanner key= new Scanner(System.in);
		
		System.out.println("Welcome to Coffee Hour!!!");
		System.out.println("What's the name of the first coffee? ");
		
		//takes user-inputed name and stores it
		name = key.nextLine();
		
		System.out.println("What's the caffeine content");
		
		//takes caffeine amount entered and stores
		caffeine = key.nextInt();
		key.nextLine(); 
		//sets coffee1 as variable with name and caffeine
		coffee1.setName(name);
		coffee1.setCaffeine(caffeine);
		
		System.out.println("What's the name of the second coffee? ");
		
		name = key.nextLine();
		
		System.out.println("What's the caffeine content");
		
		//takes caffeine amount entered and stores
		caffeine = key.nextInt();
		key.nextLine(); 
		//sets coffee1 as variable with name and caffeine
		coffee2.setName(name);
		coffee2.setCaffeine(caffeine);
	
		
		System.out.printf("It would take "+coffee1.getDangerAmount()+" "+coffee1.getName()+" coffees before it's dangerous to drink more.\n");
		System.out.printf("It would take "+coffee2.getDangerAmount()+" "+coffee2.getName()+" coffees before it's dangerous to drink more.\n");
	}
}