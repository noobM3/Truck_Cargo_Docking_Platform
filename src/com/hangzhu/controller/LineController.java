package com.hangzhu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hangzhu.po.Line;
import com.hangzhu.service.LineService;

@Controller
@RequestMapping("/line/")
public class LineController
{	
	@Resource
	private LineService lineservice;
	
	@RequestMapping("search.do")
	public String getLines(String line_start,String line_end,Model model)
	{
		List<Line> lineList =null;
		lineList = lineservice.checkLines(line_start, line_end);
		/*for (Line line : lineList)
		{
			System.out.println(line);
		}*/
		//��ȡʧ�ܣ���Ŀ����·
		if(lineList == null) return "nosuchline";
		//���Ŀ����·List
		model.addAttribute("lines", lineList);
		return "getlines";
	}
}
