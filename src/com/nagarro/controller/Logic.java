package com.nagarro.controller;
import java.util.*;

import com.nagarro.model.*;
import com.nagarro.view.*;

public class Logic 
{
	public void findFlight(String dept_loc,String arrival_loc,String date,String fclass,int choiceCode,	Map<String,ArrayList<Flight>> hmap)throws Exception
	{
		
		ArrayList<Flight> arr=null;
		int flag=0;
		StringBuilder str=new StringBuilder();
		str.append(dept_loc);
		str.append(arrival_loc);
		str.append(date);
		str.append(fclass);
		if (hmap.containsKey(str.toString())) 
		{
			arr=hmap.get(str.toString());
			flag=1;
		}
			 if(!fclass.equals("EB"))
			 {
				 str.deleteCharAt(str.length()-1);
				 
				 str.append("EB");
			     if (hmap.containsKey(str.toString())) 
			     {
				      arr.addAll(hmap.get(str.toString()));
				      flag=1;
			     }
			 }
			 if(flag==0)
				 System.out.println("Flight Not Available");
			 else
			 {
				Sort sort =new Sort();
					
				sort.sort(arr, choiceCode);
						
				Display disp=new Display();
						
				disp.display(arr);
			 }
			 
	}
}