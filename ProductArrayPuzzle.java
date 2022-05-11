//problem link:https://leetcode.com/problems/product-of-array-except-self/
/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod[]=new int[nums.length];
        int mul=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                mul*=nums[i];
            }
            else
            count++;
        }
        for(int i=0;i<nums.length;i++){
           // if(nums[i]==0)
           // flag=i;
           if(nums[i]==0&&count<2){
            prod[i]=mul;
           }
           else if(nums[i]!=0&&count==0)
                 prod[i]=mul/nums[i];
        }
        return prod;
        
        
    }
}
