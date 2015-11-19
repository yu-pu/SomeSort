package com.quick;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] t={12,25,13,64,2,7,2,3};
		QuickSort quickSort=new QuickSort();
		quickSort.quickSort(t, 0, t.length-1);
		System.out.println(Arrays.toString(t));
	}
	
	// 快速排序，从小到大排序
	int[] quickSort(int[] a,int l,int r){
		if (l<r) {
			int i=l,j=r;
			int temp=a[l];  //基准数
			while(i<j){
				while(i<j&&a[j]>temp){
					j--;          //从右向左扫描第一个小于基准的数
				}
				if (i<j) {
					a[i++]=a[j];     // 把右边的数往左边移位
				}
				
				while(i<j&&a[i]<temp){
					i++;               //从左向右扫描第一个大于基准的数
				}
				if (i<j) {
					a[j--]=a[i];        // 把左边的数往右边移位
				}
			}
			a[i]=temp;
			quickSort(a, l, i-1);
			quickSort(a, i+1, r);
		}
		return a;
	}
}
