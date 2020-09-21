package com.amazon.amazonproject.ModelPack;

import org.springframework.stereotype.Component;

@Component
public class Customerdeatils 
{
	private String name;
    private String place;
    private long phnumber;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}

}
