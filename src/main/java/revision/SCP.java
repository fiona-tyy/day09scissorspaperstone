package revision;

import java.util.Random;

public class SCP {
    
    public int generateComputerChoice(){
        Random random = new Random();
        return random.nextInt(3);
    }

    // 0: scissors, 1: paper, 2: stone
    public String checkWinner(int playerChoice, int computerChoice){

        String result = "";

        if (playerChoice != computerChoice){

            switch(playerChoice){
                case 0:
                    if (computerChoice == 1 ){
                        result = "Human";
                    } else {
                        result = "Computer";
                    }
                    break;
                case 1:
                    if (computerChoice == 2){
                        result = "Human";
                    } else {
                        result = "Computer";
                    }
                    break;
                case 2:
                    if(computerChoice == 0){
                        result = "Human";
                    } else {
                        result = "Computer";
                    }
                    break;
                default:
                    break;

            }
            
        } else {
            result = "Tie";
        }
        
        return result;

    }
}
