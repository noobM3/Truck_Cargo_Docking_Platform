package com.hangzhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hangzhu.po.Line;

public interface LineServiceMapper
{
	/**
	 * 
	 * @param lname
	 * @return List<>
	 * @description:��ȡָ��������˾��������·
	 */
	public List<Object> getLines(String lname);
	
	/**
	 * 
	 * @param
	 * @return List<>
	 * @description:ƥ��������ݿ������ж�Ӧ�����غ�Ŀ�ĵص���·��������·����
	 */
	public List<Line> checkLines(@Param("line_start")String line_start,
			                      @Param("line_end")String line_end);
	 
	/**
	 * 
	 * @param lname,line_no
	 * @description:ɾ�����ݿ���ָ����˾��ָ����·
	 */
	public void deleteLine(@Param("lname")String lname,
			                @Param("line_no")int line_no);
	
	/**
	 * 
	 * @param lname
	 * @param line
	 * @return
	 * @description:Ŀ�깫˾�����·
	 */
	public boolean addLine(@Param("lname")String lname,
			                @Param("line")Line line);
	
	/**
	 * 
	 * @param
	 * @description:�������ݿ�����·����Ϣ
	 */
	public void updateLine(@Param("lname")String lname,
			                @Param("line_no")int line_no);
	//TODO
}
