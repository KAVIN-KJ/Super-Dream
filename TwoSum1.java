public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    ans = new int[]{i,j};
                }
            }
        }
        return ans;
    }
}

class TwoSum2{
    public int[] twoSum(int[] arr, int target) {
        int lt = 0;
        int rt = arr.length-1;
        while(lt<rt){
            int sum = arr[lt]+arr[rt];
            if(sum == target){
                return new int[]{lt+1,rt+1};
            }
            else if(sum<target){
                lt++;
            }
            else {
                rt--;
            }
        }
        return new int[]{};
    }
}
