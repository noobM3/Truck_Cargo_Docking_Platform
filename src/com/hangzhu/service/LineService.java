package com.hangzhu.service;

import java.util.List;

import com.hangzhu.po.Line;

public interface LineService
{
	/**
	 * 
	 * @param lname
	 * @return List<>
	 * @description:获取指定公司的所有路线
	 */
	public List<Object> getLines(String lname);
	
	/**
	 * 
	 * @param line_start
	 * @param line_end
	 * @return List<>
	 * @description:获取符合出发地和目的地的线路详情
	 */
	public List<Line> checkLines(String line_start,String line_end);
	
	/**
	 * 
	 * @param lname
	 * @param line_no
	 * @description:删除目标公司的目标线路
	 */
	public void deleteLine(String lname,int line_no);
	
	/**
	 * 
	 * @param lname
	 * @param line
	 * @return
	 * @description:向物流公司添加线路
	 */
	public boolean addLine(String lname,Line line);

	public void updateLine(String lname,int line_no);
	
}
