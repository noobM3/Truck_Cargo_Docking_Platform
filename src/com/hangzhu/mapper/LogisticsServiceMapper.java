package com.hangzhu.mapper;

import org.apache.ibatis.annotations.Param;

import com.hangzhu.po.Logistics;

public interface LogisticsServiceMapper
{
	/**
	 * 
	 * @param lname
	 * @return Logistics
	 * @description:获取指定物流公司详情
	 */
	public Logistics display(String lname);
	
	/**
	 * 
	 * @param lno
	 * @description:修改公司联系电话
	 */
	public void updateLogisticsPhone(@Param("lno")String lno,@Param("n_phone")String n_phone);
	
	/**
	 * 
	 * @param lno
	 * @description:修改公司电子邮箱地址
	 */
	public void updateLogisticsEmail(@Param("lno")String lno,@Param("n_email")String n_email);	
	
	/**
	 * 
	 * @param lno
	 * @description:修改公司地址
	 */
	public void updateLogisticsAddress(@Param("lno")String lno,@Param("n_address")String n_address);
}
