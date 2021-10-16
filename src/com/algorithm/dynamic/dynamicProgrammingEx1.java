package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx1 {

    // 피보나치 함수(Fibonacci Function)을 재귀함수로 구현
    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		result = fibo(n);
		System.out.println(result);
	
	
		int[] arr = {3,4,5};
		int lentgh = arr.length;
		System.out.println(lentgh);
	}	
}
	
	

