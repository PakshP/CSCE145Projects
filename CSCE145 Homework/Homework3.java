//Paksh Patel
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//intro
		System.out.println("Welcome Maze Runner!");
		System.out.println("You have been thrown in to the Maze, only ONE way out!!");
		//first choice
		System.out.println("You open your eyes and see three ways, forwards, left, and right. Which way do you choose?");
		String direction1 = key.next();
		
		//choice dependent
		switch (direction1) {
		
			//move forwards
			case "forwards": System.out.println("You begin to walk forwards and reach a left and right turn."+"\n"+"The left is dark and ominous, the right is sunlit and looks safe.");
				String direction2 = key.next();
			
			//left movement
			if ("left".equalsIgnoreCase(direction2)) {
				System.out.println("You take the turn and pass a sword in the ground. Do you take it? (y/n)");
				String maybe1 = key.next();
				if ("y".equalsIgnoreCase(maybe1)) {
					//ending1
					System.out.println("You grab the sword and keep walking, and out of nowhere a beast pops out of the bush!"+"\n"+"You use the sword to behead the beast and the maze disappears!"+"\n"+"Congratulations you have won!");
				} else {
					//ending2
					System.out.println("You leave the sword and keep walking, and out of nowhere a beast pops out of the bush!"+"\n"+"You have no defense and the beast beheads you!"+"\n"+"GAME OVER!");
				}
			} 
			
			//right movement
			else {
				System.out.println("You go right and looks like the best choice until you run into a beast!"+"\n"+"He says he will let you free if you can guess the lucky number 1-10.");
				int lucky = key.nextInt();
				
				if (lucky == 7) {
					//ending3
					System.out.println("He lets you free!!"+"\n"+"Congratulations you have won!");
				} else {
					//ending4
					System.out.println("Wrong answer, he takes out his axe and beheads you!"+"\n"+"GAME OVER!");
				}
			}
			
			break;
			
			//turn left
			case "left": System.out.println("You turn left and it is pitch black. How far would you like to go (1-20)?");
				int distance = key.nextInt();
				
			//walking distance
			if (distance == 12) {
				System.out.println("You walk 12 yards and notice another turn. Do you take the turn? (y/n)");
				String maybe2 = key.next();
				
				if ("y".equalsIgnoreCase(maybe2)) {
					//ending 5
					System.out.println("You take the turn and the light just starts shining out of nowhere. The hedge falls!!"+"\n"+"Congratulation you have won!");
				} else {
					//ending 6
					System.out.println("You choose not to take the turn and keep walking. You reach a dead end and fall to your death!"+"\n"+"GAME OVER!");
				}
				
			} if (distance > 12)  { 
				//ending 7
				System.out.println("You walk far and pass a turn. You reach a dead end and fall to your death!"+"\n"+"GAME OVER!");
			
			} if ((distance < 12) && (distance > 0)) {
				//ending 8
				System.out.println("You start to walk "+distance+" yards. A beast comes out of the bush and kills you."+"\n"+"GAME OVER!");
				
			} if (distance < 0) {
				//error
				System.out.println("You walk backwards and get caught in a bear trap. A beast comes out of the bush and kills you."+"\n"+"GAME OVER!");
			
			} 
			
			break;
			
			//turn right
			case "right": System.out.println("You make a right turn and reach and find two weapons. You get to pick one, Axe or Sword.");
			String weapon = key.next();
			
			if ("Axe".equalsIgnoreCase(weapon)) {
				//ending 9
				System.out.println("You take the axe and a beast comes out and in a long fight, you try your best but end up dying in the end."+"\n"+"GAME OVER!");
				
			} 
			
			if ("Sword".equalsIgnoreCase(weapon)) {
				//ending 10
				System.out.println("You take the sword, becuase of the swords reach you come out victorious!"+"\n"+"Congratulation you have won!");
			}
			
		}

	}

}
