//Paksh Patel

public class Homework5Coffee {
	
	private String name;
	private int caffeine;
	
	public Homework5Coffee(){
	}
	//class to store names
	public String getName() {
		return name;
	}
	//able to use throughout any code in the same folder
	public void setName(String name) {
		this.name = name;
	}
	//class to store caffeine
	public int getCaffeine() {
		return caffeine;
	}
	//able to use throughout any code in the same folder
	public void setCaffeine(int caffeine) {
		//caffeine amount parameters
		if(caffeine < 50)
			caffeine = 50;
	
		else if(caffeine > 300)
			caffeine = 300;
	
		this.caffeine = caffeine;
	}
	//calculates amount of coffee where it would become deadly/dangerous.
	public double getDangerAmount(){
		return 180.0/((caffeine / 100.0)*6.0);
	}

}
