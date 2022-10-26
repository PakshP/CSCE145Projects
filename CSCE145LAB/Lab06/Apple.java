//Paksh Patel

//new class for the information of the Apples
public class Apple
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

