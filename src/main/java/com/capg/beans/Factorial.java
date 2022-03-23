package com.capg.beans;

public class Factorial {

	public  int getFactorial(int n) {
		int fact = 1;
		for (int x = 1; x <= n; x++) {
			fact = fact * x;
		}
		return fact;
	}
}
