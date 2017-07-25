package com.hangzhu.mapper;

import java.util.List;

import com.hangzhu.po.Transport;

public interface TransportServiceMapper
{
	/**
	 * 
	 * @param lno
	 * @return List<>
	 * @description:获取指定物流公司的所有承运关系
	 */
	public List<Object> getTransports(String lno);
	
	/**
	 * 
	 * @param trackingno
	 * @return Transport
	 * @description:匹配查找数据库中对应物流单号的承运关系并返回
	 */
	public Transport checkTransport(String trackingno);
	 
	/**
	 * 
	 * @param trackingno
	 * @description:删除数据库中对应物流单号的承运关系
	 */
	public void deleteTransport(String trackingno);
	
	/**
	 * 
	 * @param transport
	 * @return Boolean
	 * @description:向数据库中添加新的承运关系
	 */
	public boolean addTransport(Transport transport);
	
	/**
	 * 
	 * @param trackingno
	 * @description:更新数据库中承运关系的信息
	 */
	public void updateTransport(String trackingno);
	//TODO
	
}
