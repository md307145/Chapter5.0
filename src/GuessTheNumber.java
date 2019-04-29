import javax.swing.*;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String [] args) {
        int G;

        Scanner k = new Scanner(System.in);

        System.out.println("Enter number betwen 1-10");
        G = k.nextInt();
        JOptionPane.showMessageDialog(null, "The number is" +
                (1 + (int) (Math.random() * 10)));
    }

}


