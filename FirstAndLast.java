//CLICK HERE FOR [Problem link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.*/
import java.util.ArrayList;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int ele: nums){
            l.add(ele);
        }
        //ArrayList<Long> l2=new ArrayList<>();
        int arr[]=new int[2];
        arr[0]=l.indexOf(target);
        arr[1]=l.lastIndexOf(target);
        return arr;
        
    }
}
