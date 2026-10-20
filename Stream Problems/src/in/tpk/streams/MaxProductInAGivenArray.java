package in.tpk.streams;

import java.util.Arrays;

public class MaxProductInAGivenArray {

	public static void main(String[] args) {

		int[] array = { 1, 4, 9, 6, 2, 7, 8 };

		int[] sorted = Arrays.stream(array).sorted().toArray();

		int n = sorted.length;

		int maxProduct = Math.max(sorted[n - 1] * sorted[n - 2], sorted[0] * sorted[1]);

		System.out.println("Maximum product: " + maxProduct);

// ***************************************** Another approach with best time complexity

		int[] arr = { 1, 4, 9, 6, 2, 7, 8 };

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int num : arr) {

			// Track the two largest numbers
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max2 = num;
			}

			// Track the two smallest numbers
			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min2 = num;
			}
		}

		int product1 = max1 * max2;
		int product2 = min1 * min2;

		int maxProd = Math.max(product1, product2);

		System.out.println("Maximum product: " + maxProd);

	}

}
