package com.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a={22,31,4,52,1,12,10,23,12,20};
        System.out.println(binarySearch(a, 12));
	}

	//二分查找算法
	private static int binarySearch(int[] nums, int num) {
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (num < nums[mid]) {
				high = mid - 1;
			} else if (num > nums[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
