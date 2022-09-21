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
				String maybe = key.next();
				if ("y".equalsIgnoreCase(maybe)) {
					System.out.println("You grab the sword and keep walking, and out of nowhere a beast pops out of the bush!"+"\n"+"You use the sword to behead the beast and the maze disappears!"+"\n"+"Congratulations you have won!");
				} else {
					System.out.println("You leave the sword and keep walking, and out of nowhere a beast pops out of the bush!"+"\n"+"You have no defense and the beast beheads you!"+"\n"+"GAME OVER!");
				}
			} 
			
			//right movement
			else {
				//add one more if lucky number
				//System.out.println("You go right and looks like the best choice until you run into a beast! He immediatly attacks and kills you!"+"\n"+"GAME OVER!");
			}
		}

	}

}
