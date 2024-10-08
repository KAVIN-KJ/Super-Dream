import java.util.*;
public class PivotIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int tot = 0;
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            tot +=arr[i];
        }
        in.close();
        int ltsum = 0;
        for(int i=0;i<n;i++){
            int rtsum = tot - arr[i] - ltsum;
            if(rtsum==ltsum) {
                System.out.println(i);
                return;
            }
            ltsum+=arr[i];
        }
        System.out.println("No pivot found");
    }
}
