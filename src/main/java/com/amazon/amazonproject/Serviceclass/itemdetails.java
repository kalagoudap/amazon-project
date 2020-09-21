package com.amazon.amazonproject.Serviceclass;

import org.springframework.stereotype.Component;

import com.amazon.amazonproject.ModelPack.orderclass;

@Component
public class itemdetails
{
	public orderclass aceraspiron7()
	{
		return new orderclass("Acer Aspiron","black","i5 core","4gb nvidia","9th generation","windows 10",1,8,2,58990.0,2.1);
	}
	
	public orderclass acerswift()
	{
		return new orderclass("Acer Swift","black","i3 core","2gb nvidia","9th generation","windows 10",1,4,2,33990.0,2.0);
	}
	
	public orderclass aceraspiron5()
	{
		return new orderclass("Acer Aspiro5","black","i5 core","4gb nvidia","10th generation","windows 10",1,8,2,53990.0,2.2);
	}
	
	public orderclass acerprediator1()
	{
		return new orderclass("Acer Prediator300","black","i5 core","4gb nvidia","10th generation","windows 10",1,8,2,129900.0,2.1);
	}
	
	public orderclass acerprediator2()
	{
		return new orderclass("Acer Aspiron200","black","i5 core","4gb nvidia","9th generation","windows 10",1,8,2,88990.0,2.1);
	}
	
	public orderclass acerprediator3()
	{
		return new orderclass("Acer Aspiron350","black","i5 core","4gb nvidia","9th generation","windows 10",1,8,2,180990.0,2.1);
	}
}
