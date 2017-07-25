package com.hangzhu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hangzhu.mapper.LogisticsServiceMapper;
import com.hangzhu.po.Logistics;
import com.hangzhu.service.LogisticsService;

@Service
public class LogisticsServiceImpl implements LogisticsService
{
	
	@Resource
	private LogisticsServiceMapper lsm;
	
	@Override
	public Logistics display(String lname)
	{
		return lsm.display(lname);
	}

	@Override
	public void updateLogisticsPhone(String lno, String n_phone)
	{
		lsm.updateLogisticsPhone(lno, n_phone);
	}

	@Override
	public void updateLogisticsEmail(String lno, String n_email)
	{
		lsm.updateLogisticsEmail(lno, n_email);
	}

	@Override
	public void updateLogisticsAddress(String lno, String n_address)
	{
		updateLogisticsAddress(lno, n_address);
	}

}
