import java.util.Scanner;

public class HighLow
{
    public static void main(String [] args) {
        Scanner k = new Scanner(System.in);
        int userguess;
        System.out.println("Welcome to my game \n");
        System.out.println("Pick a number between 1 and 10\n");
        System.out.println(" Guess correctly win a price \n");
        System.out.println("Pick a number \n");
        userguess = k.nextInt();
        int random = (int) (Math.random()) * 10 + 1;
        if (userguess == random) {
            System.out.println("Guessed correctly!!! Connor has your prize out back");
        }
        else if (userguess > random)
            System.out.println("Wrong number, it was too high");
        else if (userguess < random)
            System.out.println("Wrong number, it was low high");
        else
            System.out.println("THat number was outside the range");

    }
}
