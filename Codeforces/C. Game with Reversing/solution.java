import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Test12 hopefully last
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            
            int countF = 0;
            int countR = 0;

            for (int i = 0; i < n; i++) {
                if(s1.charAt(i) != s2.charAt(i)){
                    countF++;
                }
                if(s1.charAt(i) != s2.charAt(n - i - 1)){
                    countR++;
                }
            }

            int ans = 2 * countF - countF % 2;

            if (countR == 0) {
                ans = Math.min(ans, 2);
            } else {
                ans = Math.min(ans, 2 * countR - (1 - countR % 2));
            }
            System.out.println(ans);
        }
    }
}