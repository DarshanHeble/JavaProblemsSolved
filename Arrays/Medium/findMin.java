// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.

public class findMin {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };

        findMinimum(a, 0);
    }

    public static int findMinimum(int a[], int low) {
        int high = a.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;

            if (a[mid] < a[high]) {
                
            }
        }
    }
}