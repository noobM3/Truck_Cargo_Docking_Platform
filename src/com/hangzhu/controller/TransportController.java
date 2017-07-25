package com.hangzhu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hangzhu.po.Transport;
import com.hangzhu.service.TransportService;

@Controller
@RequestMapping("/transport/")
public class TransportController
{
	@Resource
	private TransportService ts;
	
	@RequestMapping("search.do")
	public String search(String trackingno,Model model)
	{
		Transport result = ts.checkTransport(trackingno);
		if(result == null) return "transportsearchfail";//��ת��     /fail.jsp
		model.addAttribute("transport", result);
		return "transportinfo";//��ת��      /transportinfo.jsp
	}
	
	
}
