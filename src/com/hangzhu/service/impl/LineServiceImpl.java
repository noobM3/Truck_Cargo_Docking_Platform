package com.hangzhu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hangzhu.mapper.LineServiceMapper;
import com.hangzhu.po.Line;
import com.hangzhu.service.LineService;

@Service
public class LineServiceImpl implements LineService
{
	@Resource
	private LineServiceMapper lsm;

	@Override
	public List<Object> getLines(String lname)
	{
		return lsm.getLines(lname);
	}

	@Override
	public List<Line> checkLines(String line_start, String line_end)
	{
		return lsm.checkLines(line_start, line_end);
	}

	@Override
	public void deleteLine(String lname, int line_no)
	{
		lsm.deleteLine(lname, line_no);
	}

	@Override
	public boolean addLine(String lname, Line line)
	{
		lsm.addLine(lname, line);
		return true;
	}

	@Override
	public void updateLine(String lname, int line_no)
	{
		lsm.updateLine(lname, line_no);
	}


}
