package com.nagarro.model;
import java.util.*;

import com.nagarro.controller.*;

public class GetHMap extends TimerTask
{
	public void run()
	{
		try 
		{
			getHmap();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public  Map<String,ArrayList<Flight>> getHmap() throws Exception
	{
        Store store=new Store();
		
		return store.storeData();
		
			
	}
}
