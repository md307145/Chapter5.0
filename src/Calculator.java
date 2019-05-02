import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double Add;
        double Sub;
        double Mult;
        double Div;
        String Choise;
        System.out.println("what do you need. add, sub, mult, div");
        Choise = k.next();
        if (Choise.equalsIgnoreCase("Add") ) {
            double A;
            double B;
            System.out.println("Add is (A+B). Enter a number for A");
            A = k.nextDouble();
            System.out.println("Enter a number for B");
            B = k.nextDouble();
            Addmath(A, B);
        } else if (Choise.equalsIgnoreCase("Sub")) {
            double A;
            double B;
            System.out.println("Sub is (A-B). Enter a number for A");
            A = k.nextDouble();
            System.out.println("Enter a number for B");
            B = k.nextDouble();
            Submath(A,B);
        }else if(Choise.equalsIgnoreCase("Mult")) {
            double A;
            double B;
            System.out.println("mult is (A*B). Enter a number for A");
            A=k.nextDouble();
            System.out.println("Enter a number for B");
            B=k.nextDouble();
            multmath(A,B);
        }else if(Choise.equalsIgnoreCase("Div")){
            double A;
            double B;
            System.out.println("Div is (A/B). Enter a number for A");
            A = k.nextDouble();
            System.out.println("Enter a number for B");
            B = k.nextDouble();
            divamth(A,B);
        }


    }

    public static void Addmath(double A, double B) {
        double result;
        result = A + B;
        System.out.println("The solution of " + A + " - " + B + " is " + result);
    }
    public static void Submath(double A, double B){
        double result;
        result=A-B;
        System.out.println("the solution of "+A+" - "+B+" is "+ result);
    }
    public static void multmath(double A, double B){
        double solution;
        solution = A*B;
        System.out.println("The solution for "+A+" * "+B+" is "+solution);
    }
    public static void divamth(double A,double B){
        double solution;
        solution = A/B;
        System.out.println("The solution for "+A+" * "+B+" is "+solution);

    }
}


