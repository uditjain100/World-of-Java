package First;

import java.util.Arrays;

public class Sum_3 {

	public static void main(String[] args) {

		System.out.println(threeSum(new int[] { -3, -1, 0, 4, 6, 7 }));

	}

	public static boolean threeSum(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (twoSum(arr, -arr[i], i + 1)) {
				return true;
			}
		}
		return false;

	}

	public static boolean twoSum(int[] arr, int temp, int i) {

		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < temp) {
				i++;
			} else if (arr[i] + arr[j] > temp) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}

}
