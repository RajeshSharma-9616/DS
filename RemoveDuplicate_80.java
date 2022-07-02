package com.sharma.ds;

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicate_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int countTwice = 0;
        int c = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[i - 1]) {
                //nums[c] = nums[i];
                c++;
                countTwice = 0;
            } else {
                countTwice++;
                if (countTwice < 3) c++;
            }
    }
}

