/**
 * 题目：接雨水
 * 题目地址：https://leetcode-cn.com/problems/trapping-rain-water/submissions/
 * 解法描述：利用栈。
 * 			遍历数组
 * 			若当前值小于等于栈顶值，则当前索引位入栈
 * 			若下一个值大于栈顶索引对应的值，则弹出当前栈顶。若此时栈不为空，算出弹出索引位的蓄水量。
 * 		此时弹出索引位的左边界由弹出后的栈顶索引位对应的值决定，右边界由当前数组遍历的值决定。
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 * 3ms	39.4MB
 */
class Solution1 {
	public int trap(int[] height) {
		int ans = 0, current = 0;
		Stack<Integer> st = new Stack<Integer>();
		while (current < height.length) {
			while (!st.empty() && height[current] > height[st.peek()]) {
				int top = st.pop();
				if (st.empty())
					break;
				int distance = current - st.peek() - 1;
				int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
				ans += distance * bounded_height;
			}
			st.push(current++);
		}
		return ans;
	}
}
