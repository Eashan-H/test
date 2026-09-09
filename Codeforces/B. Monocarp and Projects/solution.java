import java.util.*;


public class Main {
    static void input(int arr[], int n, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Test1 remove notification
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long d = y - x;
            long n = Math.min(k, Math.max(0, d - x + 1));
            
            long count = 0;
            for (int i = 0; i < n; i++) {
                count += d % (x + i);
            }   
            count += (k - n) * d;

            System.out.println(count);
        }
    }
}