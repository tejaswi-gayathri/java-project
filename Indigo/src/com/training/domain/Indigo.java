package com.training.domain;

public class Indigo {
	private int flightId;
	private String source;
	private String destination;
	private int seatsAvailable;
	public Indigo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Indigo(int flightId, String source, String destination, int seatsAvailable) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.seatsAvailable = seatsAvailable;
	}
	public Indigo(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
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
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Flight ID:"+flightId+" Source:"+source+" Destination:"+destination+" Seats Available:"+seatsAvailable;
	}
	

}
