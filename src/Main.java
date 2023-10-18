import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer = null;
        Scanner tgb = new Scanner(System.in);
        System.out.println("Hur många poäng fick du på provet?");
        int points = tgb.nextInt();
        tgb.nextLine();
        if (points >= 0 && points <= 30) {
            if (points < 15) {
                answer = ("F");
            } else if (points > 14 && points < 18 ){
                answer = ("E");
            } else if (points > 17 && points < 21) {
                answer = ("D");
            } else if (points > 20 && points < 24) {
                answer = ("C");
            } else if (points > 23 && points < 27) {
                answer = ("B");
            } else if (points > 26) {
                answer = ("A");
            }
            System.out.println("Du fick betyget: " + answer);
        } else {
            System.out.println("Fusk!");
        }
    }
}