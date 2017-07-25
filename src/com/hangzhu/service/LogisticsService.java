package com.hangzhu.service;

import com.hangzhu.po.Logistics;

public interface LogisticsService
{
	public Logistics display(String lname);
	
	public void updateLogisticsPhone(String lno,String n_phone);
	
	public void updateLogisticsEmail(String lno,String n_email);	
	
	public void updateLogisticsAddress(String lno,String n_address);
}
