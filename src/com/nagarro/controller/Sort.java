package com.nagarro.controller;
import java.util.*;

import com.nagarro.model.*;
import com.nagarro.view.*;
public class Sort 
{
	public void sort(ArrayList<Flight> list,int choiceCode)
	{
		
		switch (choiceCode)
		{
		case 1:
			Collections.sort(list, new Comparator<Flight>() {
				public int compare(Flight o1, Flight o2) {
					return (o1.getFare() - o2.getFare());
				}
			});
			break;
		case 2:
			Collections.sort(list, new Comparator<Flight>() {
				public int compare(Flight o1, Flight o2) {
					return (int)(o1.getDuration() - o2.getDuration());
				}
			});
			break;
		default:
			System.out.println("Wrong Choice.");
			return;
		}
	}
}
