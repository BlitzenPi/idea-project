package controller;

public class hello {
     static int a=1;
     static int b = 2;

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,7};
        int target = 6;
        int[] sum = new int[2];
        sum = twoSum(nums,target);
        System.out.println(sum[0]+"------"+sum[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int sum = 0;
                sum = nums[i] + nums[j];
                if(target == sum){
                    two[0] = i;
                    two[1] = j;
                }
            }
        }
        return two;
    }
}
