// Kth Largest Element in an Array(medium)

// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// You must solve it in O(n) time complexity.

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4

import java.util.*;

public class KthLargestElement {
    public static int kthLargest(int nums[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // adding k elements to min heap
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 }, k = 3;

        System.out.println(kthLargest(nums, k));
    }
}
