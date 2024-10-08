import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int shift = in.nextInt();
        for (int s = 0; s < shift; s++) {
            int last = arr[n - 1];
            for (int i = n-1; i >=1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        in.close();
    }
}
    