import java.util.Scanner;

public class EvenOdd {
public static void main(String [] args){
    int userEntry;
    String result;
    Scanner k=new Scanner(System.in);
    System.out.println("Welcome to my game\n");
    System.out.println(" its called even or odd\n");
    System.out.println("enter a whole number");
    userEntry=k.nextInt();
    if(userEntry%2==0){
        result= userEntry+"number is even";
    }
    else result=userEntry+"number is odd";

}

}

