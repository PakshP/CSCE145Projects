//Paksh Patel
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Welcome! I will ask you a few questions: What is your First name?");
		String firstname = key.next();
		
		System.out.println("What is your last name?");
		String lastname = key.next();
		
		System.out.println("How old are you?");
		int age = key.nextInt();
		key.nextLine();
		
		System.out.println("What is your Major?");
		String major = key.nextLine();
		
		System.out.println("Are a Freshman, Sophomore, Junior or Senior");
		String grade = key.next();
			
		System.out.println("Do you have a minor? Enter true or false:");
		boolean chooseminor = key.nextBoolean();
		key.nextLine();
		
		
		System.out.println("What your dream destination?");
		String dream = key.nextLine();
		
		System.out.println("What is your favorite hobby?");
		String hobby = key.nextLine();
				
		System.out.println("What is your lucky number");
		int number = key.nextInt();
		key.nextLine();
		
		
		int birthyear = 2022-age;
		
		System.out.println("\n"+"Here's a quick intro for "+firstname+" "+lastname+":"+"\n");
		
		
		if(chooseminor == true) {
			System.out.println("You were born in the year "+birthyear+". You are attending UofSC and majoring in "+major+". You have a minor"+". You are a "+grade+" attending UofSC."+"\n"+"You have always wanted to go to "+dream+". You enjoy "+hobby+" as a hobby"+". Your lucky number is "+number);
			
		}	
		else {
			System.out.println("You were born in the year "+birthyear+". You are attending UofSC and majoring in "+major+". You have not chosen a minor"+". You are a "+grade+" attending UofSC."+"\n"+"You have always wanted to go to "+dream+". You enjoy "+hobby+" as a hobby"+". Your lucky number is "+number);
		}
		
		
		
	}

}
