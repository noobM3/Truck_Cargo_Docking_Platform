package com.hangzhu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hangzhu.po.Owner;
import com.hangzhu.service.OwnerService;

@Controller
@RequestMapping("/owner/")
public class OwnerController
{
	@Resource
	private OwnerService os;
	
	@RequestMapping(value="register.do",method = RequestMethod.POST)
	public String register(Owner owner,Model model)
	{
		os.addOwner(owner);
		return "ownerinfo";
	}
}
