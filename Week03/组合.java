/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
class Solution {
	public List<List<Integer>> combine(int n, int k) {
		// init first combination
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for(int i = 1; i < k + 1; ++i)
			nums.add(i);
		nums.add(n + 1);

		List<List<Integer>> output = new ArrayList<List<Integer>>();
		int j = 0;
		while (j < k) {
			// add current combination
			output.add(new LinkedList(nums.subList(0, k)));
			// increase first nums[j] by one
			// if nums[j] + 1 != nums[j + 1]
			j = 0;
			while ((j < k) && (nums.get(j + 1) == nums.get(j) + 1))
				nums.set(j, j++ + 1);
			nums.set(j, nums.get(j) + 1);
		}
		return output;
	}
}
