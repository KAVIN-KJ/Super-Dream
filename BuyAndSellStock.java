import java.util.*;
public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = in.nextInt();
        }
        System.out.println(solve1(prices));
        System.out.println(solve2(prices));
        System.out.println(solve3(prices));
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

    private static int solve3(int[] prices) {
        int dp[][][] = new int[prices.length+1][2][3];
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j][0] = 0;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                dp[prices.length][i][j] = 0;
            }
        }
        for(int i=prices.length-1;i>=0;i--){
            for(int hold = 0;hold<2;hold++){
                for(int trans = 1;trans<3;trans++){
                    int skip = dp[i+1][hold][trans];
                    int transact = 0;
                    if(hold==1){
                        transact = dp[i+1][0][trans-1] + prices[i];
                    }
                    else{
                        transact = dp[i+1][1][trans] - prices[i];
                    }
                    dp[i][hold][trans] = Math.max(skip,transact);
                }
            }
        }
        return dp[0][0][2];
    }

    /*
    * 
     * 
     * class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][] = new int[prices.length+1][2][3];
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = solve(prices,0,0,2,dp);
        return ans;
    }
    public static int solve(int[] prices,int cur, int hold,int trans,int[][][] dp){
        if(cur==prices.length || trans==0){
            return 0;
        }
        if(dp[cur][hold][trans]!=-1){
            return dp[cur][hold][trans];
        }
        int move = solve(prices,cur+1,hold,trans,dp);
        int transact = 0;
        if(hold==1){
            transact = prices[cur] + solve(prices,cur+1,0,trans-1,dp);
        }
        else{
            transact = -prices[cur] + solve(prices,cur+1,1,trans,dp);
        }
        return dp[cur][hold][trans] = Math.max(move,transact);
    }
}
     * 
     * 
     */


}
