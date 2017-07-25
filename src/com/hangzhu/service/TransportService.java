package com.hangzhu.service;

import java.util.List;

import com.hangzhu.po.Transport;

public interface TransportService
{
	public List<Object> getTransports(String lno);

	public Transport checkTransport(String trackingno);

	public void deleteTransport(String trackingno);

	public boolean addTransport(Transport transport);

	public void updateTransport(String trackingno);
}
