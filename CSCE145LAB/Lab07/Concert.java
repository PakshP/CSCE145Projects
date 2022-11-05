//Paksh Patel

public class Concert {

	private String name;
	private int capacity;
	private int numOfTicketsSoldByPhone;
	private int numOfTicketsSoldAtVenue;
	private double priceOfTicketByPhone;
	private double priceOfTicketAtVenue;
	
	//Defualt
	public Concert() {
		
	}
	
	//First set of Parameters
	public Concert(String bandName,int capacity,double priceAtPhone,double priceAtVenue){
		this.name = bandName;
		this.capacity = capacity;
		this.priceOfTicketByPhone=priceAtPhone;
		this.priceOfTicketAtVenue=priceAtVenue;
	}
	
	//second set of Parameters
	public Concert(int ticketSoldByPhone, int ticketSoldAtVenue,double priceAtPhone, double priceAtVenue){
		this.numOfTicketsSoldByPhone = ticketSoldByPhone;
		this.numOfTicketsSoldAtVenue=ticketSoldAtVenue;
		this.priceOfTicketByPhone=priceAtPhone;
		this.priceOfTicketAtVenue=priceAtVenue;
	}
	public String getBandName() {
		return name;
	}

	//Only words for name
	public void setBandName(String bandName) {
		this.name = bandName;
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	//Checking for valid data type
	public void setCapacity(int capacity) {
		if(capacity==(int)capacity){
			this.capacity = capacity;}
		else{
			System.out.println("No valid input");
		}
	}
	
	public int getNumTicketsSoldByPhone() {
		return numOfTicketsSoldByPhone;
	}
	
	public void setNumTicketsSoldByPhone(int ticketSoldByPhone) {
		if(ticketSoldByPhone == (int)ticketSoldByPhone){
			this.numOfTicketsSoldByPhone=this.numOfTicketsSoldByPhone+ticketSoldByPhone;
		}
	}
	public int getNumTicketsSoldAtVenue() {
		return numOfTicketsSoldAtVenue;
	}
	public void setNumTicketsSoldAtVenue(int ticketSoldAtVenue) {
		if(ticketSoldAtVenue==(int)ticketSoldAtVenue){
			numOfTicketsSoldAtVenue = numOfTicketsSoldAtVenue+ticketSoldAtVenue;
		}
		else{
			System.out.println("Not valid input");
		}
	}
	public double getThe_price_of_a_ticket_by_phone() {
		return priceOfTicketByPhone;
	}
	
	//able to change price
	public void setPriceByPhone(double phoneTicketPrice) {
		if(phoneTicketPrice==(double)phoneTicketPrice){
			priceOfTicketByPhone = phoneTicketPrice;
		}
		else{
			System.out.println("Not valid input");
		}
	}
	
	public double getThe_price_of_a_ticket_at_the_venue() {
		return priceOfTicketAtVenue;
	}
	
	//able to change price
	public void setPriceAtVenue(double venueAtPrice) {
		if(venueAtPrice==(double)venueAtPrice){
			priceOfTicketAtVenue = venueAtPrice;
		}
		else{
			System.out.println("Not valid input");
		}
	}
	
	//add both venue purchased tickets and phone tickets
	public int totalNumberOfTicketsSold(){
		return numOfTicketsSoldAtVenue+numOfTicketsSoldByPhone;
	}
	
	//capacity minus total tickets 
	public int ticketsRemaining(){
		return capacity-totalNumberOfTicketsSold();
	}
	
	public void buyTicketsAtVenue(int no){
		this.numOfTicketsSoldAtVenue=this.numOfTicketsSoldAtVenue+no;
	}
	
	public void buyTicketsByPhone(int no){
		this.numOfTicketsSoldByPhone=this.numOfTicketsSoldByPhone+no;
	}
	
	//total tickets sold
	public double totalSales(){
		double totalSalebyPhone = numOfTicketsSoldByPhone*priceOfTicketByPhone;
		double totalSaleAtVenue = numOfTicketsSoldAtVenue*priceOfTicketAtVenue;
		return totalSaleAtVenue+totalSalebyPhone;
	}
}

