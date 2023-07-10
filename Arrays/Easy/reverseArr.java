// reverse the array

// Given an array (or string), the task is to reverse the array/string.
// Examples : 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}

public class reverseArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        reverseArrUsingWhile(a, 0, a.length - 1);
        reverseArrUsingfor(a, a.length - 1);
    }

    // reversing an array using while loop
    public static void reverseArrUsingWhile(int a[], int first, int last) {
        // swap until first is smaller then last
        while (first < last) {
            // swap 1st and last
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;

            first++;
            last--;
        }
        // print the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // reversing an array using for loop
    public static void reverseArrUsingfor(int a[], int last) {
        // swap until half a array
        for (int i = 0; i < a.length / 2; i++) {
            // swaping
            int temp = a[i];
            a[i] = a[last];
            a[last] = temp;

            last--;
        }
        // print the array
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}
