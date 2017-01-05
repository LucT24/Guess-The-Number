/**
 * Created by Student on 1/5/2017.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) Math.ceil(Math.random() * 100);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Guess a number between 1 and 100:");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("You got it!");
                System.exit(0);
            }
            else if (guess > number) {
                System.out.println("The number is lower.");
            }
            else {
                System.out.println("The number is higher.");
            }
        }
    }
}
