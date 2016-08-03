package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 2/08/2016.
 */
public class PrimeSlow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sup = in.nextInt();

        for (int i = 2; i <= sup; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
    }
}
