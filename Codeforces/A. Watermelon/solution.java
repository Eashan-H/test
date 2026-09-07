import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 3 - 2; // Testing 3

        while (T-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0 && n > 2) {
                System.out.println("YeS");
            } else {
                System.out.println("NO");
            }
        }
    }
}