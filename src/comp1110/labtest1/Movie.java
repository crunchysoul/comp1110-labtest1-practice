package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 2/08/2016.
 */
public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie = in.nextLine();
        int duration = in.nextInt();

        int hour = duration / 60; // quotient.
        int min = duration % 60; // remainder.

        if (hour == 0) {
            if (min == 0)
                System.out.println(movie + " runs for ");
            else if (min == 1)
                System.out.println(movie + " runs for " + min + " minute");
            else
                System.out.println(movie + " runs for " + min + " minutes");
        }
        else if (hour == 1) {
            if (min == 0)
                System.out.println(movie + " runs for " + hour + " hour");
            else if (min == 1)
                System.out.println(movie + " runs for " + hour + " hour and " + min + " minute");
            else
                System.out.println(movie + " runs for " + hour + " hour and " + min + " minutes");
        }
        else {
            if (min == 0)
                System.out.println(movie + " runs for " + hour + " hours");
            else if (min == 1)
                System.out.println(movie + " runs for " + hour + " hours and " + min + " minute");
            else
                System.out.println(movie + " runs for " + hour + " hours and " + min + " minutes");
        }
    }
}
