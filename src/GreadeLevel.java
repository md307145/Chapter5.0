import java.util.Scanner;

public class GreadeLevel {
public static void main(String [] args){
    Scanner k=new Scanner(System.in);
    String year;
    String result;
    System.out.println("Enter what year you are in high school");
    year=k.next();
    switch (year)
    {
        case "Freshman":
            result= "You are a first year student.";
            break;
        case "Sophomore":
            result="You are a second year student";
            break;
        case "Junior":
            result=" You are a third year student";
            break;
        case "Senior":
            result=" you are a fourth year students";
            default:
                result= "Invalid student.";
    }
    System.out.println(result);
}
public static void aDifferentCaseBreak(){

    Scanner k=new Scanner(System.in);
    System.out.println("Please enter what year your in high school");
    int num=k.nextInt();
    String result;
    switch (num){
        case 1:
        result="Tjat is tje number"+num;
        break;
        case 2 :
            result="That is the number"+num;
            break;
        default:
            result="that is not a number available";
    }
    System.out.println("result");
}
}
