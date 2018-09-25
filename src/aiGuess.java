import java.util.Scanner;

public class aiGuess {
    public static void main(String[] args){
        System.out.println("Hello, user, what should I refer to you as?");
        Scanner number = new Scanner(System.in);
        String name = number.next();
        System.out.println("Hi, " + name + ". Let's play a guessing game. Pick a number between 1 to 100, I'll guess it!");
        System.out.println("You have to tell me if my number is (g)reater or (l)esser than your number, or if I'm (c)orrect).");
        System.out.println("Ready? Here I go!");
        int count = 1;
        int first = 0;
        int last = 100;
        while(true){
            int avg = (int)(Math.ceil(((first+last)/2.0)));
            System.out.println("Okay... is your number " + avg + " ?");
            String response = number.next();
            if (response.equals("c")){
                break;
            }
            if(response.equals("g")){
                count++;
                first = avg;
            } else if(response.equals("l")){
                count++;
                last = avg;
            } else {
                System.out.println("You have to tell me if my number is (g)reater or (l)esser than your number, or if I'm (c)orrect)!");
            }
            if(count>7){
                System.out.println("Hmm... I think you were lying at some point, " + name + ".");
                break;
            }
        }
        if(count<8){
        System.out.println("Nice! I got it! That only took me " + count + " tries, " + name + ".");
        }
    }
}
