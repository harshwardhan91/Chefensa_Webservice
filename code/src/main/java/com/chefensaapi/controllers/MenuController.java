package com.chefensaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chefensaapi.components.interfaces.IMenuService;
import com.chefensaapi.models.Menu;


@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private IMenuService menuService;
	
	@RequestMapping("/menuList")
	public Menu getMenu(@RequestParam(value="date",required=false,defaultValue="-1") String date){
		Menu menu = menuService.getMenuForDay(date);
		return menu;
	}
}
