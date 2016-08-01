package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 2/08/2016.
 */
public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; 2*i <= a; i++) {
            System.out.println(2*i);
        }
    }
}
