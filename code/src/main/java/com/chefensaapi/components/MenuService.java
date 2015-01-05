package com.chefensaapi.components;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chefensaapi.components.interfaces.IMenuService;
import com.chefensaapi.dao.implementations.JdbcMealDao;
import com.chefensaapi.models.Meal;
import com.chefensaapi.models.Menu;

@Component
public class MenuService implements IMenuService {

	public Menu getMenuForDay(String date) {
		Menu menu= new Menu();
		JdbcMealDao mealDao = new JdbcMealDao();
		List<Meal> mealList = mealDao.getMealOnDate(date);
		menu.setMealList(mealList);
		menu.setMenuDate(date);
		//TODO: decide menu id
		return null;
	}
}
