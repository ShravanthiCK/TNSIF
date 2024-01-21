package com.tnsif.assignment;

public class NumberProcessor {
	void findSmallestNumber(int num1, int num2, int num3) {
        int smallest = (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }
}

