package com.sharma.ds;

/*
Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int arrLength = nums.length;
        int[] aux = new int[arrLength];
        // Solution 1
        if (arrLength > 0) {
            for (int i = 0; i < k; i++) {
                aux[i] = nums[k + 1 + i];
            }
            for (int i = 0; i < k + 1; i++) {
                aux[k + i] = nums[i];
            }
        }
        // Solution 2
        if (arrLength > 0) {
            for (int i = 0; i < nums.length; i++) {
                aux[(i + k) % nums.length] = nums[i];
            }
        }
    }

}
