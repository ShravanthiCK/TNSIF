package com.tnsif.assignment;

import java.util.Scanner;

class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.close();

        NumberProcessor numberProcessor = new NumberProcessor();
        numberProcessor.findSmallestNumber(num1, num2, num3);
    

	}

}
