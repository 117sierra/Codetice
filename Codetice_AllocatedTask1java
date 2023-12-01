import java.util.Random;
import java.util.Scanner;
class Game{
     int attempts;
     int score;
     public int game(){
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         int numberToGuess = random.nextInt(1, 101);
         System.out.println("The number is between 1-100");
//         int numberToGuess= scanner.nextInt();
         this.attempts = 0;
         int score = 0;
         System.out.println("Enter number to guess!!");
         int guess = scanner.nextInt();
         while (this.attempts < 4) {
             if (this.attempts == 3) {
                  if (guess < numberToGuess) {
                     System.out.println("Too low. Try again.");
                 } else {
                     System.out.println("Too high. Try again.");
                 }
                 System.out.println("LAST CHANCE TO GUESS!!");
                 guess = scanner.nextInt();
                 if (guess == numberToGuess) {
                     this.attempts++;
                     System.out.println("Congratulations, you guessed the correct number!");
                     this.score += 5;
                 } else if (guess < numberToGuess) {
                     this.attempts++;
                     System.out.println("All attempts have been used");
                 } else {
                     this.attempts++;
                     System.out.println("All attempts have been used");
                 }
             }
             if (attempts < 3) {
                 if (guess == numberToGuess) {
                     this.attempts++;
                     System.out.println("Congratulations, you guessed the correct number!");
                     this.score += 5;
                 } else if (guess < numberToGuess) {
                     this.attempts++;
                     System.out.println("Too low. Try again.");
                 } else {
                     this.attempts++;
                     System.out.println("Too high. Try again.");
                 }
                 guess = scanner.nextInt();
             }
         }
         return score;
     }
}

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("-------------------RANDOM NUMBER GAME-------------");
        System.out.println("Enter name of the player: ");
        String name= sc.next();
        Game game = new Game();
        int score =game.game();
        boolean round=true;
        while(round) {
            System.out.println("Do you want to play one more round??");
            String ans = sc.next();
            if (ans.equals("Yes")) {
                System.out.println("Next Round Begins!!");
                score += game.game();
            }else {
                round=false;
            }

        }
        System.out.println("GAME RESULT");
        System.out.println("Player Name: "+name);
        System.out.println("Score: "+score);
    }
}
// ASSUMPTIONS- We have taken 5 rounds for this game and score is given based on number of rounds i.e.
// for each round we have given 5 points.


