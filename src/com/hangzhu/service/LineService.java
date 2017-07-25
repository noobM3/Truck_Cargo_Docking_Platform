package com.hangzhu.service;

import java.util.List;

import com.hangzhu.po.Line;

public interface LineService
{
	/**
	 * 
	 * @param lname
	 * @return List<>
	 * @description:��ȡָ����˾������·��
	 */
	public List<Object> getLines(String lname);
	
	/**
	 * 
	 * @param line_start
	 * @param line_end
	 * @return List<>
	 * @description:��ȡ���ϳ����غ�Ŀ�ĵص���·����
	 */
	public List<Line> checkLines(String line_start,String line_end);
	
	/**
	 * 
	 * @param lname
	 * @param line_no
	 * @description:ɾ��Ŀ�깫˾��Ŀ����·
	 */
	public void deleteLine(String lname,int line_no);
	
	/**
	 * 
	 * @param lname
	 * @param line
	 * @return
	 * @description:��������˾�����·
	 */
	public boolean addLine(String lname,Line line);

	public void updateLine(String lname,int line_no);
	
}
