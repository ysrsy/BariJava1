package com.company.LeetCode;


import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        while (i<length -2){
            int start = i+1;
            int end = length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                int diff = Math.abs(sum - target);
                if(sum == target){
                    return sum;
                }
                if(diff<min){
                    min=diff;
                    ans=sum;
                }
                if (sum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
            i++;
        }
        return ans;
    }
}
public class Q3SumClosest {

    public static void main(String[] args) {
       int[] nums = {-1,2,1,-4};
       int target = 1;
       Solution solution = new Solution();
       solution.threeSumClosest(nums,target);
    }
}
