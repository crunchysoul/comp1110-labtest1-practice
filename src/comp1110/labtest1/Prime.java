package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by joshuazhao on 4/08/2016.
 */
public class Prime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// open a IO input.

        int n = in.nextInt();//declare int n.

        boolean[] isPrime = new boolean[n+1];//initialize a boolean array with length of n+1.

        for (int i=0; i<=n; i++) {
            isPrime[i] = true; // assume all in range are prime.
        }
        isPrime[0] = false; // 1 is not prime.
        isPrime[1] = false; // 2 is not prime.
        
        for (int i=2; i*i<=n; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
