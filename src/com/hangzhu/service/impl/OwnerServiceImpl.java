package com.hangzhu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hangzhu.mapper.OwnerServiceMapper;
import com.hangzhu.po.Owner;
import com.hangzhu.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService
{
	@Resource
	private OwnerServiceMapper osm;

	@Override
	public boolean addOwner(Owner owner)
	{
//		if(osm.checkOwner(owner.getOno()) != null)
//			return false;
		osm.addOwner(owner);
		return true;
	}

	@Override
	public void updatePone(String ono, String n_phone)
	{
		osm.updatePhone(ono, n_phone);
	}

}
