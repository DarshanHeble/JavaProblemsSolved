// Trapping Rain Water Given n non-negative integers representing an elevation map where the width of each bar is 1,compute how much water it can trap after raining.

// Example 1:

// Input:height=[0,1,0,2,1,0,1,3,2,1,2,1]Output:6 Explanation:The above elevation map(black section)is represented by array[0,1,0,2,1,0,1,3,2,1,2,1].In this case,6 units of rain water(blue section)are being trapped.Example 2:

// Input:height=[4,2,0,3,2,5]Output:9

public class trapRainWater {
    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // Initialize two arrays to store the maximum heights on the left and right
        // sides
        int[] leftMax = new int[a.length];
        int[] rightMax = new int[a.length];

        // Initialize the leftMax array
        leftMax[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }

        // Initialize the rightMax array
        rightMax[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }

        // Calculate the amount of water trapped
        int totalWater = 0;
        for (int i = 0; i < a.length; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - a[i];
            totalWater += water;
        }

        // Print the total amount of water trapped
        System.out.println("The total amount of water trapped is: " + totalWater);
    }
}
