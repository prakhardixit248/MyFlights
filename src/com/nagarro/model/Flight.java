package com.nagarro.model;
import java.util.Collections;
import java.util.Comparator;

public class Flight
{
	private String flightNum;
	private String departLoc;
	private String arrivalLoc;
	private String date;
	private int fare;
	private double duration;
	private String fclass;
	private String avail;
	private String time;
	private String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDepartLoc() {
		return departLoc;
	}

	public void setDepartLoc(String departLoc) {
		this.departLoc = departLoc;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getFclass() {
		return fclass;
	}

	public void setFclass(String fclass) {
		this.fclass = fclass;
	}

	public String getAvail() {
		return avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String toString()
	{
		if(this.fclass.contains("B"))
			return this.flightNum+"         |  "+(int)(this.fare*1.4)+"   |    "+this.duration+"       | "+this.date+" |     "+this.time+"   |     "+this.fclass +"   |  "+ this.filename.toUpperCase();
		
		
			return this.flightNum+"         |  "+this.fare+"   |    "+this.duration+"       | "+this.date+" |     "+this.time+"   |     "+this.fclass +"    |  "+ this.filename.toUpperCase();
		
	}
}
