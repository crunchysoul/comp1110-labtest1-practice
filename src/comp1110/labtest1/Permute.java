package comp1110.labtest1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by joshuazhao on 4/08/2016.
 */
public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringA = in.nextLine();
        String stringB = in.nextLine();

        if (stringA.length() != stringB.length()) {
            System.out.println("No");
        }
        else {
            char[] charsA = stringA.toCharArray();
            char[] charsB = stringB.toCharArray();

            Arrays.sort(charsA);
            Arrays.sort(charsB);

            if (Arrays.equals(charsA, charsB)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
