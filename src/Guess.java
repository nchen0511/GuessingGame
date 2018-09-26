import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        System.out.println("Hello, user, what should I refer to you as?");
        Scanner number = new Scanner(System.in);
        String name = number.next();
        System.out.println("Hi, " + name + ". Let's play a guessing game. Do you want (m)e to guess, or (y)ou? Or would you rather play (h)angman?");
        String mode = number.next();
        if (mode.equals("m")) {
            System.out.println("Pick a number between 1 to 100, I'll guess it!");
            System.out.println("You have to tell me if my number is (g)reater or (l)esser than your number, or if I'm (c)orrect).");
            System.out.println("Ready, " + name + "? Here I go!");
            int count = 1;
            int first = 0;
            int last = 100;
            while (true) {
                int avg = (int) (Math.ceil(((first + last) / 2.0)));
                System.out.println("Okay... is your number " + avg + " ?");
                String response = number.next();
                if (response.equals("c")) {
                    break;
                }
                if (response.equals("g")) {
                    count++;
                    first = avg;
                } else if (response.equals("l")) {
                    count++;
                    last = avg;
                } else {
                    System.out.println("You have to tell me if my number is (g)reater or (l)esser than your number, or if I'm (c)orrect)!");
                }
                if (count > 7) {
                    System.out.println("Hmm... I think you were lying at some point, " + name + ".");
                    break;
                }
            }
            if (count < 8) {
                System.out.println("Nice! I got it! That only took me " + count + " tries, " + name + ".");
            }
        } else if (mode.equals("y")) {
            System.out.println("Okay, " + name + ", please select a difficulty (1~4).");
            int num;
            int difficulty;
            int count = 0;
            while (true) {
                difficulty = number.nextInt();
                if (difficulty > 4 || difficulty < 1) {
                    System.out.println("Hey, that's out of the scale! Enter a valid number");
                } else {
                    num = (int) (Math.random() * Math.pow(10, difficulty));
                    break;
                }
            }
            System.out.println("I am thinking of a number between 0 to " + (int) (Math.pow(10, difficulty)) + " (including 0), can you guess it, " + name + "?");
            while (true) {
                int guess = number.nextInt();
                if (guess == num) {
                    break;
                } else {
                    if (guess > num) {
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
        } else if (mode.equals("h")){
            System.out.println("Okay! This requires two player. The first person will choose a word and the other person will guess");
            System.out.println("What is your word?");
            int life = 7;
            String word = number.next().toLowerCase();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nMake sure to remember your word! Now it's player two's turn to guess a letter.");
            String progress = "";
            for(int i=0;i<word.length();i++){
                progress+="_";
            }
            while(true){
                String letter = number.next().toLowerCase();
                if(letter.length()==1){
                    if(word.contains(letter)){
                        String check = word;
                        while(check.contains(letter)){
                            progress = progress.substring();// WIP
                            check = check.substring(); //WIP
                            )
                        }
                    }
                } else {
                    System.out.println("Please choose one letter");
                }
            }
        } else {
            System.out.println("Okay, I guess you don't want to play...");
        }
    }
    public static void draw(int life){
        System.out.println("O");
    }
}
