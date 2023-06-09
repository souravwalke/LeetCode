package coding;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] result = twosum();

		System.out.println(Arrays.toString(result));

	}

	private static int[] twosum() {

		int target = 6;
		int[] nums = {3,3};
		int [] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0; i < nums.length; i++) {
			if(!map.isEmpty()) {
				int numToFind = target - nums[i];
				if(map.containsKey(numToFind)) {
					result[0] = map.get(numToFind);
					result[1] = i;
					break;
				}
				else {
					map.put(nums[i], i);
				}
			}
			else {
				map.put(nums[i], i);
			}
		}

		return result;

	}

}
