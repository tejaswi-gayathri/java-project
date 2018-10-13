package com.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.training.domain.Indigo;
import com.training.ifaces.FlightDetails;

@WebService(endpointInterface="com.training.ifaces.FlightDetails")
public class IndigoService implements FlightDetails {
	List<Indigo> flightList;
	List<Indigo> resultList;
	

	public IndigoService() {
		super();
		flightList=new ArrayList<>();
		flightList.add(0,new Indigo(101,"bangalore","vizag",45));
		flightList.add(1,new Indigo(102,"delhi","mumbai",58));
		flightList.add(2,new Indigo(103,"chennai","bangalore",66));
		flightList.add(3,new Indigo(104,"kochi","vizag",50));
		
	}


	@Override
	public List<Indigo> findSeatsAvailable(String source, String destination) {
		resultList=new ArrayList<>();
		for(Indigo ind:flightList ){
			if(ind.getSource().equals(source)&&ind.getDestination().equals(destination)){
				resultList.add(ind);
			}
		}
		return resultList;
	}

}
