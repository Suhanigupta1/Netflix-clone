/*package whatever //do not write package name here */
import java.util.*;

class GFG
{
// Function to find the maximum sum
static int rec(int nums[], int idx,int N)
{
	if (idx >= N)
		return 0;
	return Math.max(nums[idx] + rec(nums, idx + 2, N),
				rec(nums, idx + 1, N));
}



// Driver Code
public static void main(String args[])
{
	// Creating the array
	int[] arr = { 5, 5, 10, 100, 10, 5 };
	int N = 6;

	// Function call
	System.out.println(rec(arr,0, N));
}
}

// This code is contributed by shubhamrajput6156
