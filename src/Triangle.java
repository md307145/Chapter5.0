import java.util.Scanner;

public class Triangle {

    public static void main(String [] args){
      int Choise;
      Scanner k=new Scanner(System.in);
       System.out.println(" What type of triangle are you solving for ");
        System.out.println("1.Right ");
        System.out.println("2.Isoceles");
        System.out.println("3. Equalateral");
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

    }
    public static void equilateralTriangle(){
        double sideAll;
        Scanner k=new Scanner(System.in);
        System.out.println("enter a side ");
        sideAll=k.nextDouble();

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
        System.out.println("");

    }
}
