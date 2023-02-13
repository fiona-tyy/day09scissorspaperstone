package revision;

import java.util.Scanner;

public final class App {
    private App() {
    }

    
    public static void main(String[] args) {

        String[] choices = {"scissors", "paper", "stone"};

        int playerWinCount = 0;
        int computerWinCount = 0;

        
        // keyboard input into scanner object
        Scanner scanner = new Scanner(System.in);
        
        // variable to keep track of player's input and computer's input
        String playerSelection = "";
    
        
        // Instantiate SCP class
        SCP scp = new SCP();
        
        while (!playerSelection.equalsIgnoreCase("Q")){

            // keep track of who is the winner for each round
            String winner = "";

            // generate computer choice
            int computerSelection = 0;
            computerSelection = scp.generateComputerChoice();

            // detect input from user
            System.out.println("Enter (0) scissors, (1) paper, (2) stone, (Q) quit application");
            playerSelection = scanner.nextLine();

            if(!playerSelection.equalsIgnoreCase("Q")){
                int playerOption = Integer.parseInt(playerSelection);

                // valid player entry
                if(playerOption >=0 && playerOption <=2){
                    winner = scp.checkWinner(playerOption, computerSelection);
                    if(winner.equalsIgnoreCase("human")){
                        System.out.println("Player wins this round");
                        playerWinCount++;
                    } else if (winner.equalsIgnoreCase("computer")){
                        System.out.println("Computer wins this round");
                        computerWinCount++;
                    } else {
                        System.out.println("Tied this round");
                    }

                } else {
                    System.out.println("You have entered an invalid option.");
                    continue;
                }
            }
        }

        // show results of player and computer at end of game
        System.out.printf("Player win count: %d\n", playerWinCount);
        System.out.printf("Computer win count: %d\n", computerWinCount);
        System.out.println(playerWinCount > computerWinCount ? "Player wins..." : (playerWinCount < computerWinCount ? "Computer wins..." : "It is a tie"));

        // close scanner
        scanner.close();
    }
}
