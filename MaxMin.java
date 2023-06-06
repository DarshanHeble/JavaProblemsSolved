// Maximum and minimum of an array using minimum number of comparisons(easy)

// Given an array of size N.
//  The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

// Examples:

// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//               Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
//               Maximum element is: 35

public class MaxMin {
    public static void main(String[] args) {
        int a[] = { 3, 5, 4, 1, 9 };
        int Max, Min;
        if (a[0] > a[1]) {
            Max = a[0];
            Min = a[1];
        } else {
            Max = a[1];
            Min = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > Max) {
                Max = a[i];
            } else if (a[i] < Min) {
                Min = a[i];
            }
        }
        System.out.println("Maximum No is " + Max + "\nMinimum No is " + Min);
    }
}
