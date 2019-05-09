import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String computerAnswer;
        String userAnswer;






        int[] game = {1, 2, 3};



        for(int rockpaperscissors: game){
            rockpaperscissors = (int) (Math.random() * 3);
            if (rockpaperscissors == 0){
                computerAnswer = "Rock";

            } else if (rockpaperscissors == 1){
                computerAnswer = "Paper";

            } else if (rockpaperscissors == 2){
                computerAnswer = "Scissors";
            }
        }

        System.out.println("Enter in Rock Paper or Scissors");

        userAnswer = keyboard.nextLine().toLowerCase();

        computerAnswer = "none";

        if((userAnswer.equals ("rock"))&(computerAnswer == "Rock")){
            System.out.println("You both picked rock");
        }
        else if((userAnswer.equals ("paper"))&(computerAnswer == "Paper")){
            System.out.println("You both picked paper");
        }
        else if((userAnswer.equals ("scissors"))&(computerAnswer == "Scissors")) {
            System.out.println("You both picked scissors");
        }
        else if((userAnswer.equals ("scissors"))&(computerAnswer == "Rock")) {
            System.out.println("You lost to rock");
        }
        else if((userAnswer.equals ("rock"))&(computerAnswer == "Paper")) {
            System.out.println("You lost to paper");
        }
        else if((userAnswer.equals ("paper"))&(computerAnswer == "Scissors")) {
            System.out.println("You lost to scissors");
        }
        else if((userAnswer.equals ("paper"))&(computerAnswer == "Rock")) {
            System.out.println("You won against rock");
        }
        else if((userAnswer.equals ("scissors"))&(computerAnswer == "Paper")) {
            System.out.println("You won against paper");
        }
        else if((userAnswer.equals ("rock"))&(computerAnswer == "Scissors")) {
            System.out.println("You won against scissors");
        }
        else{
            System.out.println("That is not a valid answer");
        }


        boolean loop = false;
        while (loop) {
            System.out.println("");





        }
    }
}
