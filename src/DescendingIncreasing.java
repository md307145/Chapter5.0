import java.util.Scanner;

public class DescendingIncreasing {
    public static void main(String [] args){
        int A;
        int B;
        int C;

        Scanner k=new Scanner(System.in);
        System.out.println("Welcome to increasing and descending\n");
        System.out.println("Enter the first number");
        A=k.nextInt();
        System.out.println("Enter the second number");
        B=k.nextInt();
        System.out.println("Enter the Third number");
        C=k.nextInt();

        if( A> B && B>C) {

            System.out.println(A+","+B+ ","+C+" is Descending ");

        }
        if(A<B && B<C){
            System.out.println(A+","+B+ ","+C+" is increasing");
        }
        else
            System.out.println("Enter The numbers in Order");


    }
}
