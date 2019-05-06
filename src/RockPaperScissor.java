import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int a;

        Scanner k=new Scanner(System.in);
        int random = (int) (Math.random()) * 3 + 1;

        display("Chose 1 for rock");
        display("Chose 2 for paper");
        display("Chose 3 for scissor");
        a=k.nextInt();
        guess(a, random);

    }
    public static void guess(int choice, int r){
        String result = null;
        if(choice == 1){
            if(r==1){
               result="Tie";
            }
            else if(r == 2){
                result="Lose";
            }
            else if(r == 3){
                result="Win";
            }
        }
        else if (choice == 2){
            if(r==1){
                result="Win";
            }
            else if(r == 2){
                result="Tie";
            }
            else if(r == 3){
                result="Loss";
            }

        }
        else if(choice == 3){
            if(r==1){
                result="Loss";
            }
            else if(r == 2){
                result="Win";
            }
            else if(r == 3){
                result="Tie";
            }

        }

        display(result);
    }
    public static void display(String r){
        System.out.println(r);
    }

        }



