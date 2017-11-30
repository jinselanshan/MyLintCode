407. 加一 



给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。

该数字按照大小进行排列，最大的数在列表的最前面。
您在真实的面试中是否遇到过这个题？
样例

给定 [1,2,3] 表示 123, 返回 [1,2,4].

给定 [9,9,9] 表示 999, 返回 [1,0,0,0].




public class Solution {
    /*
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
       // 定义一个进位
		int bit = 1;
		ArrayList<Integer> list = new ArrayList<Integer> ();

		for (int i = digits.length - 1; i >= 0; i--) {
			list.add((digits[i] + bit) % 10);
			bit = (digits[i] + bit) / 10;
		}

		if (bit == 1) {
			list.add(1);
		}

		int[] res = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			res[i] = (int) list.get(list.size() - 1 - i);
		}

		return res;
    }
}
