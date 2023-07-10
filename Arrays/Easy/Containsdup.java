// Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array,
//  and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// import a HashSet class into a program 
import java.util.HashSet;

public class Containsdup {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1 };
        System.out.println(checkDuplicates(a));
    }

    // create a boolean function so that you can return true and false
    public static boolean checkDuplicates(int a[]) {
        // create a hashSet object
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            // check if a[0] value is present in the hashSet
            if (hs.contains(a[i])) {
                // if yes return true
                return true;
            } else {
                // else add to hashSet
                hs.add(a[i]);
            }
        }
        // return false if there is no Duplicates
        return false;
    }
}
