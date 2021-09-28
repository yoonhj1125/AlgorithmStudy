package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	1. 선택정렬 알고리즘 : 처리되지 않은 데이터중 가장 작은 데이터를 선택하여 맨앞에 있는 데이터와 바꾸는 것 !
		 */

		int[] arr = {7,2,3,4,2};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int tmp = i;
				if(arr[i] > arr[j]) {
					tmp = j;
				}
			}
			
			int value = arr[i];
			arr[i] = 
			
		}
		
	}

}
