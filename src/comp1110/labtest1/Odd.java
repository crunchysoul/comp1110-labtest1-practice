package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 2/08/2016.
 */
public class Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (isOdd(a))
            System.out.println(a + " is odd");
        else
            System.out.println(a + " is even");
    }

    public static boolean isOdd(int i) {
        return (i % 2 != 0);
    }
}
