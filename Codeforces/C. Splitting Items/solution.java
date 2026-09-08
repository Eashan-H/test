import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Test12 hopefully last
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int ans = 0;
            for (int i = n - 2; i >= 0 && k > 0; i -= 2) {
                int temp = arr[i + 1] - arr[i];
                if (arr[i] + k <= arr[i + 1]) {
                    arr[i] += k;
                } else {
                    arr[i] = arr[i + 1];
                }
                k = k - temp;
            }

            int d = 1;
            for (int i = n - 1; i >= 0; i--) {
                ans = ans + d * arr[i];
                d *= -1;
            }

            System.out.println(ans);
        }
    }
}