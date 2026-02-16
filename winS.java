import java.util.*;
public class winS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];   
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        int r=maxi(a,k,n);
        System.out.println("Maximum element in the array is: " + r);

    }
    public static int maxi(int[] a, int k, int n) {
        int max = 0;
        int win = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (i >= k - 1) {
                win = Math.max(win, max);
                if (a[i - k + 1] == max) {
                    max = 0;
                    for (int j = i - k + 2; j <= i; j++) {
                        if (a[j] > max) {
                            max = a[j];
                        }
                    }
                }
            }
        }
        return win;
    }
}
