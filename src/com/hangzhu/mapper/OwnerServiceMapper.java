package com.hangzhu.mapper;

import org.apache.ibatis.annotations.Param;

import com.hangzhu.po.Owner;

public interface OwnerServiceMapper
{
	public Owner checkOwner(@Param("ono")String ono,@Param("password")String password);
	
	public void addOwner(Owner owner);
	
	public void updatePhone(@Param("ono")String ono,@Param("n_phone")String n_phone);
	
	public void updatePw(@Param("ono")String ono,@Param("n_pw")String n_pw);
	
}
