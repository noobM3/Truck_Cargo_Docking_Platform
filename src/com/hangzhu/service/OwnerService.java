package com.hangzhu.service;

import com.hangzhu.po.Owner;

public interface OwnerService
{	
	/**
	 * 
	 * @param owner
	 * @description:�����ݿ�������»���
	 */
	public boolean addOwner(Owner owner);
	
	/**
	 * 
	 * @param ono
	 * @param n_phone
	 * @description:�޸Ļ�����ϵ�绰
	 */
	public void updatePone(String ono,String n_phone);
	
}
