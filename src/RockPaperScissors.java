import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        int computerAnswer;
        String userAnswer;



        int[] game = {1, 2, 3};


        computerAnswer = (game[(int)(Math.random()*2)]);



        System.out.println("This is a test " + computerAnswer);



        System.out.println("Enter in Rock Paper or Scissors");

        userAnswer = keyboard.nextLine().toLowerCase();


        //0 is rock
        //1 is paper
        //2 is scissors



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
        }
        else if((userAnswer.equals ("rock"))& computerAnswer == 1) {
            System.out.println("You lost to paper");
        }
        else if((userAnswer.equals ("paper"))& computerAnswer == 2) {
            System.out.println("You lost to scissors");
        }
        else if((userAnswer.equals ("paper"))& computerAnswer == 0) {
            System.out.println("You won against rock!");
        }
        else if((userAnswer.equals ("scissors"))& computerAnswer == 1) {
            System.out.println("You won against paper!");
        }
        else if((userAnswer.equals ("rock"))&  computerAnswer == 2) {
            System.out.println("You won against scissors!");
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
