import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int) ((Math.random() * 100) + 1);
        int rounds = 5;
        while (rounds >= 0) {
            System.out.println("Enter the input");
            int input = sc.nextInt();
            if (input == number) {
                System.out.println("CONGRATS!");
                return;
            } else if (input < number) {
                System.out.println("The Actual number is greater than your guess!");
            } else if (input > number) {
                System.out.println("The Actual number is less than your guess!");
            }
            rounds--;
        }

    }
}
