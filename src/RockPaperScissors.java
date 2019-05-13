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

        String stop;

        boolean loop = true;
        while (loop) {

            //0 is rock
            //1 is paper
            //2 is scissors


            computerAnswer = (game[(int)(Math.random()*2)]);


            System.out.println("\n\n\n\n\n\n\n\n");
            /*System.out.println("This is a test " + computerAnswer);*/



            System.out.println("Enter in Rock Paper or Scissors" + "\n\n\n\n\n\n\n\n");
            userAnswer = keyboard.nextLine().toLowerCase();
            System.out.println("\n\n");



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

            System.out.println("\n" + "Your points = " + userPoints + "   " + "Computer's points = " + computerPoints + "\n");

            System.out.println("Would you like to continue? Y/N");

            stop = keyboard.nextLine().toLowerCase();

            if (stop.equals("y")){
                loop = true;
            } else if (stop.equals("n")){
                loop = false;
            } else{
                loop = true;
            }







        }
    }
}
