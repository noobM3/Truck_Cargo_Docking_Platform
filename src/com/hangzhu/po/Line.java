package com.hangzhu.po;

public class Line
{
	private String	lname;		// ��˾����
	private int		line_no;	// ��·���:1,2,...
	private String	line_start;	// ������
	private String	line_end;	// Ŀ�ĵ�
	private int		weight;		// ��·������������
	private int		price;		// ��·����۸񣬵�λ��Ԫ/��
	private double	time;		// ��·ƽ����ʱ
	private String	used;		// Y:����·���� N:����·δ��
	
	public Line()
	{
		// TODO Auto-generated constructor stub
	}

	public Line(String lname, int line_no, String line_start, String line_end, int weight, int price, double time,
			String used)
	{
		this.lname = lname;
		this.line_no = line_no;
		this.line_start = line_start;
		this.line_end = line_end;
		this.weight = weight;
		this.price = price;
		this.time = time;
		this.used = used;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public int getLine_no()
	{
		return line_no;
	}

	public void setLine_no(int line_no)
	{
		this.line_no = line_no;
	}

	public String getLine_start()
	{
		return line_start;
	}

	public void setLine_start(String line_start)
	{
		this.line_start = line_start;
	}

	public String getLine_end()
	{
		return line_end;
	}

	public void setLine_end(String line_end)
	{
		this.line_end = line_end;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public double getTime()
	{
		return time;
	}

	public void setTime(double time)
	{
		this.time = time;
	}

	public String getUsed()
	{
		return used;
	}

	public void setUsed(String used)
	{
		this.used = used;
	}

	@Override
	public String toString()
	{
		return "Line [lname=" + lname + ", line_no=" + line_no + ", line_start=" + line_start + ", line_end=" + line_end
				+ ", weight=" + weight + ", price=" + price + ", time=" + time + ", used=" + used + "]";
	}
	
	
}
