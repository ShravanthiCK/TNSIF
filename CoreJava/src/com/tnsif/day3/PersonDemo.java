package com.tnsif.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of object
				Person person = new Person();
				
				//scanner class to read the input
				Scanner sc = new Scanner(System.in);
				
				String name,gender;
				int age,income,tax;
				System.out.println("enter name");
				name=sc.nextLine();
				System.out.println("Enter gender");
				gender = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter income");
				income = sc.nextInt();
				System.out.println("enter tax");
				tax = sc.nextInt();
				
				person.setName(name);
				person.setGender(gender);
				person.setAge(age);
				person.setIncome(income);
				person.setTax(tax);
				System.out.println(person);
				
	}

}
