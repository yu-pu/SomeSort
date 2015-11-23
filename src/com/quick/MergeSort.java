package com.quick;

import java.util.Arrays;

/**
 * 归并排序
 * 
 * @author yupu
 * @date 2015年11月23日
 */
public class MergeSort {
	// 先进行分治成有序序列，再进行有序序列的两两合并
	public static void main(String[] args) {
		int[] a = { 12, 23, 15, 12, 10, 3, 34, 43, 13, 33, 90, 64 };
		new MergeSort().mergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private void mergeSort(int nums[], int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// 左边分治
			mergeSort(nums, low, mid);
			// 右边分治
			mergeSort(nums, mid + 1, high);
			// 合并治理
			merge(nums, low, high, mid);
		}
	}

	private void merge(int nums[], int low, int high, int mid) {
		int temp[] = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		while (j <= high) {
			temp[k++] = nums[j++];
		}

		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
	}

}
