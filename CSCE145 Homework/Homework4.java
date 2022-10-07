//Paksh Patel
import java.util.Scanner;
import java.util.Random;

public class Homework4 {

    public static void main(String[] args) {

        while(true){
        	//Variables Declared
        	int UserSelected = 0; 
            int totalRounds = 0;
            int totalWins = 0;
            int totalLoss = 0;  

            System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");

            Scanner key = new Scanner (System.in); 
            
            //Loop code until 3 rounds completed
            while(totalRounds < 3) { 
                System.out.println("Enter \"Rock\", \"Paper\" or \"Scissors\"");
                //random selection for comp
                Random randSel = new Random();
                
                //Computer selection variable
                int COMP = 1 + randSel.nextInt(3);
                
                //options
                int rock1 = 1; 
                int paper2 = 2;
                int scissors3 = 3;
                
                //reading userinput
                String UserInput =  key.next(); 
                if(UserInput.equalsIgnoreCase("Rock"))  {
                    UserSelected = 1;
                }
                else if(UserInput.equalsIgnoreCase("Paper")) {
                    UserSelected = 2;
                }
                else if(UserInput.equalsIgnoreCase("Scissors")) {
                    UserSelected = 3;
                }

                //if the user selects an option that isn't rock, paper, or scissors
                if (UserSelected > 3 || UserSelected < 1) {
                    totalLoss++;
                    totalRounds++; 
                    System.out.println("Not a valid input! Computer Wins");
                    System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");

                }
                //if user selects the same as computer
                if(UserSelected == COMP){ 
                    if(UserSelected == scissors3){ 
                        System.out.println("Scissors v Scissors! Tie!");
                        totalRounds++;
                    }
                    else if(UserSelected == rock1){
                        System.out.println("Rock v Rock! Tie!");
                        totalRounds++;
                    }
                    else if(UserSelected == paper2){
                        System.out.println("Paper v Paper! Tie!");
                        totalRounds++;
                    }
                    System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");

                }

                //if user selects scissors
                if(UserSelected == scissors3) 
                    if(COMP == paper2){ 
                        System.out.println("Scissors v Paper! Player Wins!");
                        totalWins++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }                           
                    else if(COMP == rock1){ 
                        System.out.println("Scissors v Rock! Computer Wins!");
                        totalLoss++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
                //if user selects rock
                if(UserSelected == rock1) 
                    if(COMP == scissors3 ){ 
                        System.out.println("Rock v Scissors! Player Wins!");
                        totalWins++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }   
                                                
                    else if (COMP == paper2){
                        System.out.println("Rock v Paper! Computer Wins!");
                        totalLoss++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
                //if user selects paper
                if(UserSelected == paper2)
                    if(COMP == rock1){ 
                        System.out.println("Paper v Rock! Player Wins!");
                        totalWins++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
                                            
                    else if (COMP == scissors3){ 
                        System.out.println("Paper v Scissors! Computer Wins!");
                        totalLoss++;
                        totalRounds++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
            }

            //if user wins 2 out of 3
            if(totalWins > totalLoss){ 
                System.out.println("The Player Wins!"); 
            }
            //if user loses 2 out of 3
            else if(totalLoss > totalWins){ 
                System.out.println("The Computer Wins!"); 
            }
            //asking user to play again
            System.out.println("Play again? \"Yes\" or \"No\""); 
            Scanner key2 = new Scanner(System.in); 

            String futher = key2.next(); 
            //if user selects yes
            if(futher.equalsIgnoreCase("yes"))
            {
                System.out.println("\n");
                //repeats code from start
                main(null); 
            }
            //if user selects no
            else if(futher.equalsIgnoreCase("no"))
            {
                System.out.println ("Goodbye!"); 
                //ends all code
                System.exit(0); 
            }
            
        }    
    }
}