/**
 * 题目：加一
 * 题目地址：https://leetcode-cn.com/problems/plus-one/
 * 解法描述：从右往左遍历数组，加一余十存余数，若余数为零，则继续遍历，余数不为零则返回结果。
 * 		边界值处理：若最后一个值（数组零位）也产生了进位，返回一个长度比原数组大一的新数组，零号位为一，其余填补零。
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 * 备注：若产生最高位进位，开辟了一块新的数组内存空间
 * 0ms 37.8MB
 */
class Solution2 {
	public int[] plusOne(int[] digits) {
		int forward = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0) {
				return digits;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}
