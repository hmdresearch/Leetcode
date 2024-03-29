/*
You are given a 0-indexed integer array nums and an integer k. You have a starting score of 0.

In one operation:

choose an index i such that 0 <= i < nums.length,
increase your score by nums[i], and
replace nums[i] with ceil(nums[i] / 3).
Return the maximum possible score you can attain after applying exactly k operations.

The ceiling function ceil(val) is the least integer greater than or equal to val.
*/

class Solution {
    public long maxKelements(int[] nums, int k) {
        long maxScore = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums) {
            pq.add(num);
        }
        while (k > 0) {
            int peek = pq.poll();
            maxScore += peek;

            if(peek % 3 != 0 ) {
                 pq.add(peek / 3 + 1);
            } else {
                pq.add(peek / 3);
            }           
            --k;
        }
        return maxScore;
    }
}
