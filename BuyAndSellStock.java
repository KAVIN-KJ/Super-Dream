import java.util.*;
public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prices[] = new int[n];
        System.out.println(solve1(prices));
        System.out.println(solve2(prices));

        in.close();
    }

    private static int solve2(int[] prices) {
        int start = prices[0];
        int ans = 0;
        for(int i : prices){
            if(start<i){
                ans+=(i-start);
            }
            start = i;
        }
        return ans; 
    }

    private static int solve1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices){
            min = Math.min(min,i);
            max = Math.max(max, i-min);
        }
        return max;
    }
}
