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
            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, n, sc);

            int zero = 0;
            for (int i = 1; i < n - 1; i++) {
                if(arr[i] == 0) zero++;
            }
            
            
            int count = 0;
            if(arr[0] == 1){
                if(zero > 0){
                    count++; 
                    zero--;
                }
                 else{
                    System.out.println(-1);
                    continue;
                }
            }

            if(arr[n - 1] == 1){
                if(zero > 0){
                    count++; 
                    zero--;
                }
                 else{
                    System.out.println(-1);
                    continue;
                }
            }

            System.out.println(count);
            
        }
    }
}