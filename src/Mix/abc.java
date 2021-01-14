package First;

import static java.lang.System.*;

public class abc {

	public static void main(String[] args) throws java.lang.Exception {

		out.println("xcm");

		// String str = "qwerty";
		// System.out.println(str.substring(0,12));

		// System.out.println(701 % 26);
		// System.out.println("ghj".toLowerCase());
		// System.out.println(Integer.MAX_VALUE);
		// for (char ch = '1'; ch < '9'; ch++) {
		// System.out.println(ch);
		// }
		// System.out.println();
		// HashMap<Integer, Integer> map = new HashMap<>();
		// SortedSet<Integer> s = new TreeSet<Integer>(map.keySet());
		// StringBuilder sb = new StringBuilder();
		// HashSet<Integer> set = new HashSet<Integer>(map.values());
		// String str = "Hey this is Ram";
		// System.out.println("[" + str.substring(0, 0) + "]");
		// LinkedList<Integer> list = new LinkedList<Integer>();
		// String[] words = str.split(" ");
		// int[] arr = new int[10];
		// for (String word : words)
		// System.out.println(word);
		// PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// pq.addAll(map.keySet());
		// List<String> listt = new ArrayList<>();
		// ArrayList<Integer> a = new ArrayList<Integer>();
		// Scanner scn = new Scanner(new InputStreamReader(System.in));
		// String str = scn.next();
		// int ans = maxnum(str);
		// System.out.println(ans);
		// Random ran = new Random();
		// int num = ran.nextInt();
		// String a = "ab";
		// String b = "ac";
		// int ans = b.compareTo(a);
		//
		// System.out.println(ans);
		//
		// List<List<Integer>> list = new ArrayList<>();
		// ArrayList<String> x = new ArrayList<String>();
		// for (int i = 0; i < 5; i++) {
		// list.add(new ArrayList<Integer>());
		// }
		// list.get(1).add(5);
		// list.get(1).add(10);
		// list.get(3).add(5);
		// list.get(3).add(5);
		//
		// for (List<Integer> l : list) {
		// System.out.println(l);
		// }
		// Iterator<List<Integer>> i = list.iterator();
		// while (i.hasNext()) {
		// List<Integer> lit = i.next();
		// if (lit.size() == 0) {
		// i.remove();
		// }
		// }
		// System.out.println();
		// System.out.println();
		//
		// for (List<Integer> l : list) {
		// System.out.println(l);
		// }
		//
		// HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// LexicoCounting(0, 1000);
		// fun1();
		//
		// int[] arr = new int[100];
		// Arrays.fill(arr, -1);

		/*
		 * int[][] arr = { { 1, 2 }, { 2, 4 } }; Arrays.sort(arr);
		 * System.out.println(arr[0][0]); System.out.println(arr[0][1]);
		 * System.out.println(arr[1][0]); System.out.println(arr[1][1]);
		 */
		/*
		 * String a = "10101010"; int ans = Integer.parseInt(a);
		 * System.out.println(ans);
		 * 
		 * int[] arr = new int[] { 12, 3, 4, 5, 6 }; corr(arr);
		 * System.out.println(arr[0]);
		 */

		/*
		 * ArrayList<Integer> list = new ArrayList<>();
		 * 
		 * int[] arr = { 1, 2, 3, 45, 5 };
		 */

		// pattern(5);

		// System.out.println(least_string("This isrgd a string"));
		// System.out.println(hammingWeight(00000000000000101010));

		// System.out.println(Math.abs(-26));
	}

	public static int[][] MatrixMultiplication(int[][] arr1, int[][] arr2) {

		int n = arr2.length;
		int m = arr1[0].length;
		int[][] res = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					res[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		return res;
	}

	public static void fun1() {
		int[] arr = new int[5];
		fun2(arr);
		System.out.println(arr[2]);
	}

	public static void fun2(int[] temp) {

		fun3(temp, 0);

	}

	public static void fun3(int[] temp, int i) {

		if (i == 2) {
			temp[i] = 5;
			return;
		}

		fun3(temp, i + 1);
		return;

	}

	public static void LexicoCounting(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.print(curr + " ");
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			LexicoCounting(curr * 10 + i, end);

		}
	}

	public static void corr(int[] arr) {
		// arr[0] = 10;

		int[] ans = new int[] { 200, 30, 40, 50, 60 };
		arr = ans;
		return;
	}

	public static int hammingWeight(int n) {

		System.out.println(n);
		int count = 0;

		while (n != 0) {
			if (n % 10 == 1) {
				count++;
			}
			n /= 10;
			System.out.println(n);
		}

		return count;

	}

	public static int least_string(String str) {

		int len = 0;
		int min_len = Integer.MAX_VALUE;
		String ans = "";
		String min_ans = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				if (min_len > len) {
					min_len = len;
					min_ans = ans;
				}
				len = 0;
				ans = "";
			} else {
				len++;
				ans += ch;
			}
		}

		System.out.println(min_ans);

		return min_len;

	}

	/*
	 * Google Interview Question 1 2 3 4 5 5 4 3 2 1 1 2 3 4 * * 4 3 2 1 1 2 3 * * *
	 * * 3 2 1 1 2 * * * * * * 2 1 1 * * * * * * * * 1
	 */

	public static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}

		for (int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 2; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j < n - i + 2) {
					System.out.print(j + " ");
				} else {
					System.out.print("*" + " ");
				}
			}

			for (int j = 1; j <= n; j++) {
				if (j > i - 1) {
					System.out.print((n - j + 1) + " ");
				} else {
					System.out.print("*" + " ");
				}
			}

			System.out.println();

		}

	}

	public static int maxnum(String str) {

		String mba = "CHEF";
		int var1 = 0;
		int var2 = 0;
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char cc = mba.charAt(j);
			if (ch == cc) {
				var1++;
				j++;
			}
			if (var1 == 4) {
				j = 0;
				var1 = 0;
				var2++;
			}
		}

		return var2;

	}
}
