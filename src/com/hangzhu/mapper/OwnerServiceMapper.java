package com.hangzhu.mapper;

import org.apache.ibatis.annotations.Param;

import com.hangzhu.po.Owner;

public interface OwnerServiceMapper
{
	public Owner checkOwner(String owner);
	
	public void addOwner(Owner owner);
	
	public void updatePhone(@Param("ono")String ono,@Param("n_phone")String n_phone);

}
