import java.util.Scanner;

public class Triangle {

    public static void main(String [] args){
      int Choise;
      Scanner k=new Scanner(System.in);
       System.out.println(" What type of triangle are you solving for ");
        System.out.println("1.Right ");
        System.out.println("2.Isosceles");
        System.out.println("3. Equilateral");
        Choise= k.nextInt();
        if(Choise ==1)
            rightTriangle();
        else if( Choise ==2)
            isoscelesTriangle();
        else if(Choise == 3)
            equilateralTriangle();
        else
            triangleDoesNotEcist();
    }
    public static void isoscelesTriangle(){
        double a;
        double b;
        double c;
        String side;
        Scanner k=new Scanner(System.in);
        System.out.println("What side are you solving for to find");
        side=k.next();

        if(side. equals ("a")) {
            System.out.println("What is side b");
            b = k.nextDouble();
            System.out.println("What is side C");
            c = k.nextDouble();
            Amath(b,c,side);
            }
            else if(side.equals("b")){
            System.out.println("What is side a ");
            a=k.nextDouble();
            System.out.println("What is side c ");
            c=k.nextDouble();
            Bmath(a,c,side);
            }
            else if(side.equals("c")){
            System.out.println("enter side A or side B");
            a=k.nextDouble();
            Cmath(a,side);
        }


    }
    public static void equilateralTriangle(){
        double sideAll;
        Scanner k=new Scanner(System.in);
        System.out.println("enter a side ");
        sideAll=k.nextDouble();
        equalmath(sideAll);

    }
    public static  void triangleDoesNotEcist(){

    }
    public static void rightTriangle(){
        Scanner k =new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice;
        System.out.println("Whats side are you ting to solve");
        sideChoice = k.next();

        if(sideChoice. equals ("A")){
            System.out.println("What is side b");
            sideB=k.nextDouble();
            System.out.println("What is side C");
            sideC=k.nextDouble();
            calculationsA(sideB,sideC , sideChoice);
        }
        else if (sideChoice.equals("B")){
            System.out.println("What is side A");
            sideA=k.nextDouble();
            System.out.println("What is side C");
            sideC=k.nextDouble();
            mathb(sideA,sideC,sideChoice);
        }
        else if(sideChoice.equals("C")){
            System.out.println("What is side A");
            sideA=k.nextDouble();
            System.out.println("What is side B");
            sideB=k.nextDouble();
        }


    }
    public static void calculationsA(double b, double c, String choice){
        double a;
       a= Math.sqrt(c*c-b*b);

       System.out.println("The side " +choice+ " = "+ a);
    }
    public static void mathb(double a, double c, String choice){
        double b;
        b=Math.sqrt(c*c-a*a);
        System.out.println("The side " +choice+ " = "+ b);
    }
    public static void mathc(double a, double b, String choice){
        double C;
        C=Math.sqrt(a*a+b*b);
        System.out.println("The side " +choice+ " = "+ C);
    }
    public static void equalmath(double sideAll){
        double a;
        a= sideAll;
        System.out.println(" If one side is "+ a+" then, all the side are ="+a);
        double H;
        H= a/2;
        double Height;
        Height= Math.sqrt(H);
        System.out.println("The height of this triangle is "+ Height);

    }
    public static void Amath( double b, double c ,String side){
        double a;
        a= b;


        System.out.println(" Side A = side B. Side A is "+ a);
    }
    public static void Bmath(double a, double c, String side){
        double b;
        b=a;
        System.out.println("Side B is = to half of C. It also is = to A making B = to "+b);
    }
    public static void Cmath(double a, String side){
        double c;
        c=a*2;
        System.out.println("side C is "+c);
    }
}
