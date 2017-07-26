package com.hangzhu.service;

import com.hangzhu.po.Owner;

public interface OwnerService
{	
	/**
	 * 
	 * @param owner
	 * @description:向数据库中添加新货主
	 */
	public boolean addOwner(Owner owner);
	
	/**
	 * 
	 * @param ono
	 * @param n_phone
	 * @description:修改货主联系电话
	 */
	public void updatePone(String ono,String n_phone);
	
}
