package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 1/08/2016.
 */
public class ShoeSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        double a = in.nextDouble();
        System.out.println(Math.round(a*5.0));
    }
}
