import java.util.*;
public class LeftShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        int shift = in.nextInt();

        for(int s=0;s<shift;s++){
            int first = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = first;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        in.close();
    }
}
