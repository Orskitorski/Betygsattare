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
                answer = ("Du fick betyget F");
            } else if (points > 14 && points < 18 ){
                answer = ("Du fick betyget E");
            } else if (points > 17 && points < 21) {
                answer = ("Du fick betyget D");
            } else if (points > 20 && points < 24) {
                answer = ("Du fick betyget C");
            } else if (points > 23 && points < 27) {
                answer = ("Du fick betyget B");
            } else if (points > 26) {
                answer = ("Du fick betyget A");
            }
        } else {
            answer = ("Fusk!");
        }
        System.out.println(answer);
    }
}