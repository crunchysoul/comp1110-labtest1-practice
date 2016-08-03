package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 4/08/2016.
 */
public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sourceBase = in.nextInt();
        int destinationBase = in.nextInt();
        String number = in.next();

        int decimal = Integer.parseInt(number, sourceBase);
        String strB = Integer.toString(decimal, destinationBase);

        System.out.println(strB);
    }
}
