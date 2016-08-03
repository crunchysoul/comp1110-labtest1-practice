package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 4/08/2016.
 */
public class Ones {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        String strA = Integer.toBinaryString(a);
        int count = 0;

        for (int i=0; i<strA.length(); i++) {
            if (strA.charAt(i) == '1') {
                count++;
            }
        }

        System.out.println(count);
    }
}
