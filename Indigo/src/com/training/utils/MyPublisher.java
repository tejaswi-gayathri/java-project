package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.IndigoService;

public class MyPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5000/IndigoRequest", new IndigoService());
		System.out.println("service running");

	}

}
