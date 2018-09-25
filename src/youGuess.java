import java.util.Scanner;

public class youGuess {
    public static void main(String[] args){
        System.out.println("Hello, user, what should I refer to you as?");
        Scanner number = new Scanner(System.in);
        String name = number.next();
        System.out.println("Hi, " + name + ". Let's play a guessing game. Please select a difficulty (1~4).");
        int num;
        int difficulty;
        int count = 0;
        while(true){
            difficulty = number.nextInt();
            if(difficulty>4||difficulty<1){
                System.out.println("Hey, that's out of the scale! Enter a valid number");
            } else {
                num = (int)(Math.random()*Math.pow(10,difficulty));
                break;
            }
        }
        System.out.println("I am thinking of a number between 0 to " + (int)(Math.pow(10,difficulty)) +  " (including 0), can you guess it, " + name + "?");
        while(true){
            int guess = number.nextInt();
            if(guess==num) {
                break;
            } else {
                if (guess>num){
                    System.out.println("The number is lesser than " + guess + ", try again!");
                    count++;
                } else {
                    System.out.println("The number is greater than " + guess + ", try again!");
                    count++;
                }
            }
        }
        number.close();
        System.out.println("You got it, " + name + ", the number was " + num + "! It only took you " + count + " guess(es).");
    }
}
