
365. 二进制中有多少个1



/*
计算在一个 32 位的整数的二进制表示中有多少个 1.
您在真实的面试中是否遇到过这个题？
样例

给定 32 (100000)，返回 1

给定 5 (101)，返回 2

给定 1023 (1111111111)，返回 10
*/


public int countOnes(int num) {
		// write your code here
		int count = 0;
		while (num != 0) {
			num = num & (num - 1); // 消除num中最后一位的1
			count++;
		}
		return count;
}
