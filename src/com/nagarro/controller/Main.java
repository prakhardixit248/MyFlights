package com.nagarro.controller;
import java.util.*;

import com.nagarro.model.*;
import com.nagarro.view.*;
public class Main 
{
	public static void main(String[]  pr) throws Exception
	{
		int ch=1;
		
		Scanner in=new Scanner(System.in);
		
		InputData input=new InputData();
		
		Timer timer=new Timer();
		
		GetHMap task =new GetHMap();
		
		timer.schedule(task, 100);
		
		
		while(ch==1)
		{
		  task.run();
			
		  input.setHmap(task);
		
		  input.run();
		  
		  System.out.println("1 to continue 0 to Exit");
		  
		  ch=in.nextInt();
		}
		timer.cancel();
		task.cancel();
		input.interrupt();
	}
}
