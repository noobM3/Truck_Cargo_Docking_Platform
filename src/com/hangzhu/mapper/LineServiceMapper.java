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
	 * @description:获取指定物流公司的所有线路
	 */
	public List<Object> getLines(String lname);
	
	/**
	 * 
	 * @param
	 * @return List<>
	 * @description:匹配查找数据库中所有对应出发地和目的地的线路并返回线路详情
	 */
	public List<Line> checkLines(@Param("line_start")String line_start,
			                      @Param("line_end")String line_end);
	 
	/**
	 * 
	 * @param lname,line_no
	 * @description:删除数据库中指定公司的指定线路
	 */
	public void deleteLine(@Param("lname")String lname,
			                @Param("line_no")int line_no);
	
	/**
	 * 
	 * @param lname
	 * @param line
	 * @return
	 * @description:目标公司添加线路
	 */
	public boolean addLine(@Param("lname")String lname,
			                @Param("line")Line line);
	
	/**
	 * 
	 * @param
	 * @description:更新数据库中线路的信息
	 */
	public void updateLine(@Param("lname")String lname,
			                @Param("line_no")int line_no);
	//TODO
}
