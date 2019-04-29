import java.util.Scanner;

public class Ageinsultgenerator {
    public static void main(String [] args) {
        Scanner k = new Scanner(System.in);
        int age;
        String job;
        String result;
        System.out.println("Welcome to my age insult generator");
        System.out.println("please enter your age");
        age = k.nextInt();
        if (age <= 12) {
            result = "you ARE NOT 18, and your bad at FORTNIGHT";

        } else if (age > 12 && age < 20) {
            result = "Your are close to death";
        } else if (age > 21 && age < 30) {
            result = " How much money you don't have";
            System.out.println("Did you get a job");
            if (job == "yes") {
                result = "yes i have a job";
            } else
                result = "No, im a ded beat";
        } else if (age > 31 && age < 40) {
            result = "and the kids old man";
        } else if (age > 41 && age < 50) {
            result = "You had help getting into this computer, OLD MAN";
        }
        else if( age >51)
            result="Why are you even doing this, when your times is all most gone";
        public static void displayMessage(String result){
            System.out.println(result);
        }
    }
