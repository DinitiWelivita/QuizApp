package quizapp;

import java.util.Scanner;

/**
 *
 * @author Diniti Welivita
 */
public class QuizApp {
  
    public static void main(String[] args) {
         int score = 0;
    Scanner kboard = new Scanner (System.in);
     System.out.println("Hello!");
     System.out.println("What color is the sky?");
     String answer1 = kboard.nextLine();
     
     if (answer1.equalsIgnoreCase ("blue")) {
         score++;
         System.out.println("Correct!");
     }
     
     else {
         System.out.println("What planet are you living on??");
     }
     
     System.out.println("What is a baby spider called?");
     String answer2 = kboard.nextLine ();
     
     if (answer2.equalsIgnoreCase ("spiderling")) {
        System.out.println("Correct!");
        score++;
    }
     
     else {
         System.out.println ("Absolutely not.");
     }
     
     System.out.println("What day of the week are heart attacks most likely to happen on?");
     String answer3 = kboard.nextLine ();
     
     if (answer3.equalsIgnoreCase("monday")) {
         System.out.println("Correct!");
         score++;
     }
     
     else {
         System.out.println("Hint: it's the one that starts with M");
     }
     
     System.out.println("What state of matter is lightning?");
     String answer4 = kboard.nextLine();
     
     if (answer4.equalsIgnoreCase("plasma")) {
         System.out.println ("Correct!");
         score++;
     }
     
     else {
         System.out.println("Wrong!!");
     }
     
     System.out.println("What was the first soda in space?");
     String answer5 = kboard.nextLine();
     
     if (answer5.equalsIgnoreCase("Coca Cola")) {
         System.out.println("Correct!");
        score++;
     }
     
     else {
         System.out.println("nope :/");
     }
     
     System.out.println("Your score is "+ score);
     
     if (score==0) {
         System.out.println("You should do some studying");
     }
     else if (score==5) {
         System.out.println("Perfect Score! :D");
     }
     
     else {
     System.out.println("Nice job :)");
     }
    }
     
    
    
}
