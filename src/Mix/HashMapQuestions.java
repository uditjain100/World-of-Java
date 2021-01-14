package First;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapQuestions {

	public static void main(String[] args) {

		int[] ans = intersection(new int[] { 1, 2, 2, 3, 4, 5 }, new int[] { 2, 2, 3, 4 });

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	private static int[] intersection(int[] arr1, int[] arr2) {

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], false);
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				map.put(arr2[i], true);
			}
		}
		
		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}
		}

		int[] ans = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}

		return ans;

	}

	public static char max_freq(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int val = map.get(cc);
				map.put(cc, val + 1);
			} else {
				map.put(cc, 1);
			}
		}

		int max = Integer.MIN_VALUE;
		char cc = ' ';

		Set<Map.Entry<Character, Integer>> entries = map.entrySet();

		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				cc = entry.getKey();
			}
		}

		return cc;

	}

}
