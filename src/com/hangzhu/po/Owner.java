package com.hangzhu.po;

public class Owner
{
	private String	ono;		// 货主编号
	private String	oname;		// 货主姓名
	private String	sex;		// 性别
	private String	phone;		// 电话
	private String	password;	// 密码
	private int		cer;		// 认证状态--0：未认证 1：已认证
	
	public Owner()
	{
		// TODO Auto-generated constructor stub
	}

	public Owner(String ono, String oname, String sex, String phone, String password, int cer)
	{
		super();
		this.ono = ono;
		this.oname = oname;
		this.sex = sex;
		this.phone = phone;
		this.password = password;
		this.cer = cer;
	}

	public String getOno()
	{
		return ono;
	}

	public void setOno(String ono)
	{
		this.ono = ono;
	}

	public String getOname()
	{
		return oname;
	}

	public void setOname(String oname)
	{
		this.oname = oname;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getCer()
	{
		return cer;
	}

	public void setCer(int cer)
	{
		this.cer = cer;
	}

	@Override
	public String toString()
	{
		return "Owner [ono=" + ono + ", oname=" + oname + ", sex=" + sex + ", phone=" + phone + ", password=" + password
				+ ", cer=" + cer + "]";
	}

	
	
}
