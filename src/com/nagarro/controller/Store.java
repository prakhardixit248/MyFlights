package com.nagarro.controller;
import java.util.*;

import com.nagarro.model.*;
import com.opencsv.*;
import java.io.*;
public class Store 
{
	
	public Map<String,ArrayList<Flight>> storeData() throws Exception
	{

	      File f = null;
	      File[] paths = null;
	      StringBuilder str; 
	      Flight flight;
	      CSVReader reader;
	      
	      f = new File("src\\FlightInformation");
	                                 
	      paths = f.listFiles();
	        
	      Map<String,ArrayList<Flight>> hmap=new HashMap<String,ArrayList<Flight>>();
	        
	        for(File st :paths)
	        {
	        	
	        	reader = new CSVReader(new FileReader(st.getAbsolutePath()),'|');


	        	List<String[]> records = reader.readAll();
	 		
	 		
	        	String fs[];

	        	Iterator<String[]> iterator = records.iterator();
	        	iterator.next();
	 		
	        	while (iterator.hasNext()) 
	        	{
	        		String[] record = iterator.next();
	        		if(record[7].equalsIgnoreCase("Y")) //Saving Flight Data Only of Seat_Availability is Y Else Discarding
	        		{
		        		flight = new Flight();
		        		flight.setFlightNum(record[0]);
		        		flight.setDepartLoc(record[1]);
		        		flight.setArrivalLoc(record[2]);
		        		flight.setDate(record[3]);
		        		flight.setTime(record[4]);
		        		flight.setDuration(Double.parseDouble(record[5]));
		        		flight.setFare(Integer.parseInt(record[6]));
		        		flight.setAvail(record[7]);
		        		flight.setFclass(record[8]);
		        		fs=st.getName().split("[//.]");
		        		flight.setFilename(fs[0]);
		        		str=new StringBuilder();
		        		str.append(record[1]);
		        		str.append(record[2]);
		        		str.append(record[3]);
		        		str.append(record[8]);
	        			if(hmap.containsKey(str))
	        			{
	        				hmap.get(str).add(flight);
	        			}
	        			else
	        			{
	        				ArrayList<Flight> list=new ArrayList<>();
	        				list.add(flight);
	        				hmap.put(str.toString(),list);
	        			}
	        		}
	 		   }       
	     }
		return hmap;

	}
}
