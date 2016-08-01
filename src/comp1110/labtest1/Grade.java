package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 2/08/2016.
 */
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        if (0 <= marks && marks < 50) {
            System.out.println("N");
        }
        else if (50 <= marks && marks < 60) {
            System.out.println("P");
        }
        else if (60 <= marks && marks < 70) {
            System.out.println("C");
        }
        else if (70 <= marks && marks < 80) {
            System.out.println("D");
        }
        else if (80 <= marks && marks <= 100) {
            System.out.println("HD");
        }
        else
            System.out.println("Bad mark");
    }
}
