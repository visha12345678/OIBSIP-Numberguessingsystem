import java.io.PushbackReader;
import java.util.Scanner;

public class NumberGuessingSystem {
    public static void main(String[] args) {
        System.out.println("Start the game: you can select the number");
        System.out.println("between 0-100 digit");
        Scanner sc = new Scanner(System.in);

        boolean againplay;
        do {
            playgame();
            System.out.println("if you like to play again this game?yes/No");
            againplay = sc.nextBoolean();

        } while (againplay);
        System.out.println("Thanks for playing this game...");
    }

    static void playgame() {
        int actualnumber;
        int userguessingno;
        int guessingcountno;
        actualnumber = (int) (100 * Math.random()) + 1;
        guessingcountno = 0;
        System.out.println();
        System.out.println("What is your first guessing number");
        Scanner sc = new Scanner(System.in);
        while (true) {
            userguessingno = sc.nextInt();
            guessingcountno++;
            if (userguessingno == actualnumber) {
                System.out.println("congratulations " + guessingcountno +
                        " guesses! my no is " + actualnumber);
                break;
            }
            if (guessingcountno == 10) {
                System.out.println("you can not get this number in 10 guess");
                System.out.println("you are failed. Number is " + actualnumber);
                break;
            }

            if (userguessingno < actualnumber) {
                System.out.println("your guessing no is low. try to some high number:");
            } else if (userguessingno > actualnumber) {
                System.out.println("your guessing no is high. try to some how number:");
            }
            System.out.println();

        }
    }
}
