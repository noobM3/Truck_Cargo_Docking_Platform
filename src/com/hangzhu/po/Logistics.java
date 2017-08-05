package com.hangzhu.po;


public class Logistics
{
	private String	lno;	// 公司编号
	private String	lname;	//
	private int		cer;	// 认证状态
	private int		scale;	// 公司规模
	private String	l_phone;// 联系电话
	private String	email;	// 电子邮箱
	private String	address;// 地址
	private int		s_time;	// 成功承运次数
	private int		f_time;	// 有异议承运次数
	
	public Logistics()
	{
		// TODO Auto-generated constructor stub
	}

	public Logistics(String lno, String lname, int cer, int scale, String l_phone, String email, String address,
			int s_time, int f_time)
	{
		super();
		this.lno = lno;
		this.lname = lname;
		this.cer = cer;
		this.scale = scale;
		this.l_phone = l_phone;
		this.email = email;
		this.address = address;
		this.s_time = s_time;
		this.f_time = f_time;
	}

	public String getLno()
	{
		return lno;
	}

	public void setLno(String lno)
	{
		this.lno = lno;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public int getCer()
	{
		return cer;
	}

	public void setCer(int cer)
	{
		this.cer = cer;
	}

	public int getScale()
	{
		return scale;
	}

	public void setScale(int scale)
	{
		this.scale = scale;
	}

	public String getL_phone()
	{
		return l_phone;
	}

	public void setL_phone(String l_phone)
	{
		this.l_phone = l_phone;
	}

	public String getemail()
	{
		return email;
	}

	public void setemail(String email)
	{
		this.email = email;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getS_time()
	{
		return s_time;
	}

	public void setS_time(int s_time)
	{
		this.s_time = s_time;
	}

	public int getF_time()
	{
		return f_time;
	}

	public void setF_time(int f_time)
	{
		this.f_time = f_time;
	}

	@Override
	public String toString()
	{
		return "Logistics [lno=" + lno + ", lname=" + lname + ", cer=" + cer + ", scale=" + scale + ", l_phone="
				+ l_phone + ", email=" + email + ", address=" + address + ", s_time=" + s_time + ", f_time=" + f_time
				+ "]";
	}
	
	
}
