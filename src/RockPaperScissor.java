import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int a;

        int random = (int) (Math.random()) * 3 + 1;
        int winTotal=0;
        int loseTotal=0;
        int tieTotal=0;
        int totalGames=-1;

        Scanner k=new Scanner(System.in);
        while (a != 999)
        {
            totalGames ++;
            guess(a, random);

        display("Chose 1 for rock");
        display("Chose 2 for paper");
        display("Chose 3 for scissor");
        a=k.nextInt();
    }
    public static void guess(int choise,int r){
            String result = null;
            if (choise == 1) {
                if (r == 1) {
                    result = "Tie";
                    tieTotal ++;
                } else if (r == 2) {
                    result = "Lose";
                    loseTotal ++;
                } else if (r == 3) {
                    result = "Win";
                    winTotal ++;
                }
            } else if (choise == 2) {
                if (r == 1) {
                    result = "Win";
                    winTotal ++ ;
                } else if (r == 2) {
                    result = "Tie";
                    tieTotal ++;
                } else if (r == 3) {
                    result = "Loss";
                    loseTotal ++;
                }

            } else if (choise == 3) {
                if (r == 1) {
                    result = "Loss";
                    loseTotal ++;
                } else if (r == 2) {
                    result = "Win";
                    winTotal ++;
                } else if (r == 3) {
                    result = "Tie";
                    tieTotal ++;
                }

            }

            display(result);
        }
        System.out.println("Thanks for playing");
        System.out.println("Win total equal"+ winTotal+" Lose total equals"+ loseTotal+" and tie "+tieTotal);
        System.out.print("***************Display Gtaph***************");
        System.out.print("Win total");displayBar(winTotal);
        System.out.print("l ");displayBar(loseTotal);
        System.out.print("T" );displayBar(tieTotal);
    }
    public static void display(String r){
        System.out.println(r);

    }
    public static void displayBar(int b){
        for(int i=0; i<b; ++i){
            System.out.print("/");
        }
    }

        }



