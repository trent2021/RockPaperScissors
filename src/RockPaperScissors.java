import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int computerAnswer;
        String userAnswer;
        int computerPoints;
        computerPoints = 0;
        int userPoints;
        userPoints = 0;
        int[] game = {1, 2, 3};

        String reset;


        boolean loop = true;
        while (loop) {

            //0 is rock
            //1 is paper
            //2 is scissors


            computerAnswer = (game[(int)(Math.random()*2)]);



            if((userPoints == 0)&&(computerPoints == 0)){
                System.out.println("First to 5 points wins.");
            }

            System.out.println("Enter in Rock Paper or Scissors");
            userAnswer = keyboard.nextLine().toLowerCase();
            System.out.println("\n\n\n\n\n");


            if((userAnswer.equals ("rock"))& computerAnswer == 0){
                System.out.println("You both picked rock. It's a tie");
            }
            else if((userAnswer.equals ("paper"))& computerAnswer == 1){
                System.out.println("You both picked paper. It's a tie");
            }
            else if((userAnswer.equals ("scissors"))& computerAnswer == 2) {
                System.out.println("You both picked scissors. It's a tie");
            }
            else if((userAnswer.equals ("scissors"))& computerAnswer == 0) {
                System.out.println("You lost to rock");
                computerPoints++;
            }
            else if((userAnswer.equals ("rock"))& computerAnswer == 1) {
                System.out.println("You lost to paper");
                computerPoints++;
            }
            else if((userAnswer.equals ("paper"))& computerAnswer == 2) {
                System.out.println("You lost to scissors");
                computerPoints++;
            }
            else if((userAnswer.equals ("paper"))& computerAnswer == 0) {
                System.out.println("You won against rock!");
                userPoints++;
            }
            else if((userAnswer.equals ("scissors"))& computerAnswer == 1) {
                System.out.println("You won against paper!");
                userPoints++;
            }
            else if((userAnswer.equals ("rock"))&  computerAnswer == 2) {
                System.out.println("You won against scissors!");
                userPoints++;
            }
            else{
                System.out.println("That is not a valid answer");
            }

            System.out.println("\n" + "Your points = " + userPoints + "   " + "Computer's points = " + computerPoints);


            boolean end;
            end = false;

            if (computerPoints == 5) {
                System.out.println("The computer has 5 points. You lose");
                end = true;
            } else if (userPoints == 5) {
                System.out.println("You reached 5 points. You win!");
                end = true;
            }




            while (end){

                System.out.println("Would you like to reset? Y/N");

                reset = keyboard.nextLine().toLowerCase();

                if (reset.equals("y")){
                    loop = true;
                    end = false;

                    computerPoints = 0;
                    userPoints = 0;
                } else if (reset.equals("n")){
                    loop = false;
                    end = false;
                } else{
                    loop = true;
                }
            }











        }
    }
}
