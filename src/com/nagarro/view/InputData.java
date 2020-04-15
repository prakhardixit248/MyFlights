package com.nagarro.view;
import java.util.*;

import com.nagarro.controller.*;
import com.nagarro.model.*;
public class InputData extends Thread
{
	    Map<String,ArrayList<Flight>> hmap;
	    Logic logic;
		public void run() 
		{
			try
			{
			Scanner sr = new Scanner(System.in);

			String dept_loc, arrival_loc, date, fclass;

			int choiceCode;

			System.out.println("Enter Departure Location : ");
			dept_loc = sr.nextLine().toUpperCase();

			System.out.println("Enter Arrival Location : ");
			arrival_loc = sr.nextLine().toUpperCase();

			System.out.println("Enter Date (dd-mm-yyyy) : ");
			date = sr.nextLine().toUpperCase();

			System.out.println("Enter Flight Class : ");
			fclass = sr.next().toUpperCase();
			
			
			System.out.println(
					"Enter Output Preference :      1. Fare \t 2. Flight Duration \nEnter Preference Choice Code  : ");
			choiceCode = sr.nextInt();
			
			
			Validation validation=new Validation(dept_loc, arrival_loc, date, choiceCode);
			
			if (validation.validate())
			{
				logic=new Logic();
				logic.findFlight(dept_loc, arrival_loc, date, fclass,choiceCode,hmap);
			}
			else 
			{
				System.out.println("Invalid Input");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		public Map<String, ArrayList<Flight>> getHmap() {
			return hmap;
		}
		public void setHmap(GetHMap task) throws Exception 
		{
			this.hmap = task.getHmap();
		}
		
}
