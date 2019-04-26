import java.util.Scanner;

public class AssignVoluntteer {
    public static void main(String [] args){
        String message;
        Scanner k=new Scanner(System.in);
        int donationType;
        String volunteer;
        final int CLOTHING_CODE =1;
        final int OTHER_CODE=2;
        final String CLOTHING_PRICER ="Regina";
        final String OTHER_PRICER ="Marco";
        System.out.println("what type of donation is this");
        System.out.println("Enter "+CLOTHING_CODE+" for clothing,"+OTHER_CODE+" for anything else...");
        donationType= k.nextInt();
        if (donationType >3){
            System.out.println("You can oly enter 1 or 2");
            return;
        }
        if(donationType == CLOTHING_CODE) {
            volunteer=CLOTHING_PRICER;
            message="a clothing donation";
        }
        else {
            volunteer = OTHER_PRICER;
            message= "a non-clothing donation";
        }
        System.out.println(" You enter "+donationType);
        System.out.println("The volunteer who will price this item is "+volunteer);
        System.out.println("This is"+message);

    }
}
