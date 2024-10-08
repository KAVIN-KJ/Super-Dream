import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                B[i][j] = in.nextInt();
            }
        }
            
        in.close();
    }
}
