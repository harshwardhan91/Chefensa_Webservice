package com.chefensaapi.dao;

import javax.sql.DataSource;

import com.chefensaapi.models.Chef;

public interface ChefDao {

	public void setDataSOurce(DataSource dataSource);
	
	public Chef getChefInfo(long chef_id);

}
