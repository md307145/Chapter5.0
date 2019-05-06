import java.util.Scanner;

public class CondoSale {
    public static void main( String [] args){
        int Choise;
        int Garage
                ;
        Scanner k=new Scanner(System.in);
        System.out.println("Chose 1 for park view. Chose 2 for golf view. Chose 3 for a lake View");
        Choise=k.nextInt();
        if (Choise==1){
            System.out.println("1 or 2 car garage");
            Garage=k.nextInt();
            if(Garage==1)
                System.out.println("The cost is $150,000");
            else if(Garage==2)
                System.out.println("The cost is $155,000");
        else if(Choise==2)
                System.out.println("1 or 2 car garage");
            Garage=k.nextInt();
            if(Garage==1)
                System.out.println("The cost is $170,000");
            else if(Garage==2)
                System.out.println("The cost is $175,000");
        else if (Choise==3)
                System.out.println("1 or 2 car garage");
            Garage=k.nextInt();
            if(Garage==1)
                System.out.println("The cost is $210,000");
            else if(Garage==2)
                System.out.println("The cost is $215,000");
        }

    }
}
