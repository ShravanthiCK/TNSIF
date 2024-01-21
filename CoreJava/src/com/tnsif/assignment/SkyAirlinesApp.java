package com.tnsif.assignment;

import java.util.Scanner;

public class SkyAirlinesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        // Create FlightMessage object
        FlightMessage flightMessage = new FlightMessage();
        flightMessage.setName(name);
        flightMessage.setSource(source);
        flightMessage.setDestination(destination);

        // Print the message
        flightMessage.printMessage();

        // Close the scanner
        scanner.close();
    }
	}


