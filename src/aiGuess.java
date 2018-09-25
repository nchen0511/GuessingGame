import java.util.Scanner;

public class aiGuess {
    public static void main(String[] args){
        System.out.println("Hello, user, what should I refer to you as?");
        Scanner number = new Scanner(System.in);
        String name = number.next();
        System.out.println("Hi, " + name + ". Let's play a guessing game. Pick a number between 1 to 100, I'l guess it!");
    }
}
