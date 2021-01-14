package First;

public class ithprime {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 7, 6, 5 };
		int[] ans = waiter(arr, 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	public static int[] waiter(int[] number, int q) {

		int[] ans = new int[number.length];
		int k = 0;
		for (int i = 0; i < q; i++) {
			System.out.println("ithp " + ithp(i));
			for (int j = 0; j < number.length; j++) {
				if (number[j] != -1 && number[j] % ithp(i) == 0) {
					ans[k++] = number[j];
					number[j] = -1;
				}
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] != -1) {
				ans[k++] = number[i];
			}
		}

		return ans;
	}

	public static int ithp(int n) {

		int count = 0;
		int num = 3;
		while (count != n) {
			if (isprime(num)) {
				num++;
				count++;
			} else {
				num++;
			}
		}

		if (n == 0) {
			return 2;
		} else {
			return num - 1;
		}

	}

	public static boolean isprime(int n) {

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
