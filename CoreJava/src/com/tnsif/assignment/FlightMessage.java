package com.tnsif.assignment;

 class FlightMessage {
	 private String name;
	 private String source;
	 private String destination;
	 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public void printMessage() {
        System.out.println("Dear " + name + ", welcome onboard with service from " + source + " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.");
    }

}
