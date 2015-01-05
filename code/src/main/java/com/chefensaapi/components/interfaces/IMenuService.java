package com.chefensaapi.components.interfaces;

import com.chefensaapi.models.Menu;

public interface IMenuService {

	public Menu getMenuForDay(String date);
}
