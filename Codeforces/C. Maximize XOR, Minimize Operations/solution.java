import java.util.*;

public class Main {
    static void input(int arr[], int n, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Test1 remove notification loading check 4
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = 0;
            for (int i = 60; i >= 0; i--) {
                long mask = 1L << i;

                if (((x + y) & mask) != 0) {
                    long candidate = a | mask;

                    if (candidate <= x) {
                        a = candidate;
                    }
                }
            }

            long count = x - a;

            System.out.print((x + y) + " " + count);
            System.out.println();
        }
    }
}