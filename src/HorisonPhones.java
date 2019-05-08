import java.util.Scanner;

public class HorisonPhones {
    public static void main(String []args){
        Scanner k= new Scanner(System.in);
        String input;
        String text;
        String data;
        System.out.println("Hello, and welcome to Horizon. Are you looking for (1)less than 500 \n" +
                " minuets of talk. or (2)more than 500 minutes of talk.    ");
        input=k.next();
        if(input.equals("1") ){
            System.out.println("Do you want text");
            text=k.next();
            if(text.equalsIgnoreCase("Yes") )
                System.out.println("Plan B is your best option starting at $55 a month ");
            else
                System.out.println("Plan A is your best option, Starting at $49 a month");
            }
        else if(input.equals("2")){
            System.out.println("Do you want data.");
            text=k.next();
            if(text.equalsIgnoreCase("yes")){
                System.out.println("Do you want more or less then 2 gigabyte ");
                data=k.next();
                if(data.equalsIgnoreCase("More"))
                    System.out.println("Plan F is your best choice starting at a low price of $87 a month");
                else
                    System.out.println("Plan E is your best option Starting at $79 a month ");
            }
            else if(text.equalsIgnoreCase("no")) {
                System.out.println("Plan C will be your best option starting at $61 a month");
                System.out.println("Plan D is you best option, for the low price of $70 a month");
            }
        }


    }
    }

