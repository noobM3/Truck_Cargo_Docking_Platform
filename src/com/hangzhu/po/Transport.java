package com.hangzhu.po;

public class Transport
{
	private String	trackingno;	// 物流单号
	private String	lname;		// 公司编号
	private String	oname;		// 货主编号
	private String	cname;		// 货物编号
	private String	starting;	// 出发地
	private String	destination;// 目的地
	private String	start_time;	// 开始时间
	private String	end_time;	// 结束时间
	
	public Transport()
	{
	}
	
	public Transport(String trackingno, String lname, String oname, String cname, 
	   String starting, String destination,String start_time, String end_time)
	{
		this.trackingno = trackingno;
		this.lname = lname;
		this.oname = oname;
		this.cname = cname;
		this.starting = starting;
		this.destination = destination;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public String getTrackingno()
	{
		return trackingno;
	}

	public void setTrackingno(String trackingno)
	{
		this.trackingno = trackingno;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public String getOname()
	{
		return oname;
	}

	public void setOname(String oname)
	{
		this.oname = oname;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getStarting()
	{
		return starting;
	}

	public void setStarting(String starting)
	{
		this.starting = starting;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public String getStart_time()
	{
		return start_time;
	}

	public void setStart_time(String start_time)
	{
		this.start_time = start_time;
	}

	public String getEnd_time()
	{
		return end_time;
	}

	public void setEnd_time(String end_time)
	{
		this.end_time = end_time;
	}
	
	
	
}
