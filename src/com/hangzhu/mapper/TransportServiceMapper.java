package com.hangzhu.mapper;

import java.util.List;

import com.hangzhu.po.Transport;

public interface TransportServiceMapper
{
	/**
	 * 
	 * @param lno
	 * @return List<>
	 * @description:��ȡָ��������˾�����г��˹�ϵ
	 */
	public List<Object> getTransports(String lno);
	
	/**
	 * 
	 * @param trackingno
	 * @return Transport
	 * @description:ƥ��������ݿ��ж�Ӧ�������ŵĳ��˹�ϵ������
	 */
	public Transport checkTransport(String trackingno);
	 
	/**
	 * 
	 * @param trackingno
	 * @description:ɾ�����ݿ��ж�Ӧ�������ŵĳ��˹�ϵ
	 */
	public void deleteTransport(String trackingno);
	
	/**
	 * 
	 * @param transport
	 * @return Boolean
	 * @description:�����ݿ�������µĳ��˹�ϵ
	 */
	public boolean addTransport(Transport transport);
	
	/**
	 * 
	 * @param trackingno
	 * @description:�������ݿ��г��˹�ϵ����Ϣ
	 */
	public void updateTransport(String trackingno);
	//TODO
	
}
