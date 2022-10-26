import java.util.Scanner;

//new class for the information of the Apples
class Apple
{
	//variables set for only the apple class
	private String type;
	private double weight;
	private double price;
	
	//public class used throughout the code and classes for the first apple 
	public Apple ()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}

	//public class used throughout the code and classes for the second apple type
	public String getType()
	{
		return this.type;
	}
	
	//public class used throughout the code and classes for the second apple weight
	public double getWeight()
	{
		return this.weight;
	}
	
	//public class used throughout the code and classes for the second apple price
	public double getPrice()
	{
		return this.price;
	}
	
	public void setType (String kind)
	{
		//creating apple type
		if (kind.equalsIgnoreCase("Red Delicious") == false && kind.equalsIgnoreCase("Golden Delicious") == false && kind.equalsIgnoreCase("Gala") == false && kind.equalsIgnoreCase("Granny Smith") == false)
		{
			System.out.println ("Invalid value for type!");
			return;
		}
		type = kind;
	}
	
	public void setWeight (double weight)
	{	
		//creating apple weight
		if (weight < 0 || weight > 2)
		{
			System.out.println("Invalid value for weight!");
			return;
		}
		this.weight = weight;
	}
	
	public void setPrice (double price)
	{
		//creating apple price
		if (price < 0)
		{
			System.out.println("Invalid value for price!");
			return;
		}
		this.price = price;
	}

	public String toString()
	{
		//printing the information of the apple
		return "Type: " + this.type + "\nWeight: " + this.weight + " kg\nPrice: $" + this.price + "\n";
	}
}

//class that is actually shown in he console
public class Lab06
	{
	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to Apple Tester!!!");
		
		//creating the first apple using default values
		System.out.println("Creating a first Apple!");
		Apple apple1 = new Apple();
		System.out.println("Default values of the first apple object:");
		System.out.println(apple1.toString());
		
		//creating the second apple using user inputed values
		System.out.println("Creating the second apple object!");
		Apple apple2 = new Apple();

		System.out.println("Enter the type of the second apple object:");
		apple2.setType(key.nextLine());
		System.out.println("Enter the weight of the second apple object:");
		apple2.setWeight (key.nextDouble());
		System.out.println("Enter the price of the second apple object:");
		apple2.setPrice (key.nextDouble());
		
		System.out.println("Values of the second apple object:");
		System.out.println(apple2.toString());

		//creating the third apple using user inputed values
		System.out.println("Creating the third apple object!");
		Apple apple3 = new Apple();

		System.out.println("Enter the type of the third apple object:");
		apple3.setType(key.next());
		System.out.println("Enter the weight of the third apple object:");
		apple3.setWeight (key.nextDouble());
		System.out.println("Enter the price of the third apple object:");
		apple3.setPrice (key.nextDouble());

		//invalid values prints default values
		System.out.println("Printing the third apple's value which should not have changes from the default values");
		System.out.println("Retrieving the third apple object's type: " + apple3.getType());
		System.out.println("Retrieving the third apple object's weight: " + apple3.getWeight() + " kg");
		System.out.println("Retrieving the third apple object's price: $" + apple3.getPrice());

		key.close();
	}
}