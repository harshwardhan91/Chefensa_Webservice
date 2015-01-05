package com.chefensaapi.dao.implementations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chefensaapi.dao.MealDao;
import com.chefensaapi.models.Meal;

public class JdbcMealDao implements MealDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public final String MEAL_ID="meal_id";
	public final String MEAL_TITLE="meal_title";
	public final String MEAL_CUISINE_TYPE="meal_cuisine_type";
	public final String MEAL_IMAGE_URL="meal_image_url";
	public final String MEAL_DESCRIPTION="meal_description";
	public final String MEAL_CHEF_NAME="chef_name";
	public final String MEAL_CHEF_ID="chef_id";
	public final String MEAL_TYPE="meal_type";
	public final String MEAL_RATING="meal_rating";
	public final String MEAL_COUNT="meal_count";
	public final String MEAL_DATE="meal_date";
	public final String MEAL_TIME="meal_time";
	public final String MEAL_CHEF_IMAGE_URL="meal_chef_image_url";
	public final String MEAL_COST="meal_cost";
	
	public void setDataSOurce(DataSource dataSource) {
		this.dataSource = dataSource;	
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Meal> getMealOnDate(String date) {
		String sql = "select * from Meal where " + MEAL_DATE + " =?";
		
		List<Meal> mealList = jdbcTemplate.query(sql, new Object[]{date},new MealRowMapper());
		
		return mealList;
	}

	public Meal getMealWithId(long meal_id) {
		String sql = "select * from Meal where " + MEAL_ID + " =?";
		Meal meal = jdbcTemplate.queryForObject(sql,new Object[]{meal_id},new MealRowMapper());
		return meal;
	}

	public class MealRowMapper implements RowMapper<Meal>{

		public Meal mapRow(ResultSet rs, int arg1) throws SQLException {
			Meal meal = new Meal();
			meal.setMeal_id(rs.getInt(MEAL_ID));
			meal.setMeal_title(rs.getString(MEAL_TITLE));
			meal.setMeal_cusine_type(rs.getString(MEAL_CUISINE_TYPE));
			meal.setMeal_chef_name(rs.getString(MEAL_CHEF_NAME));
			meal.setMeal_chef_id(rs.getString(MEAL_CHEF_ID));
			meal.setMeal_type(rs.getString(MEAL_TYPE));
			meal.setMeal_image_url(rs.getString(MEAL_IMAGE_URL));
			meal.setMeal_count(rs.getInt(MEAL_COUNT));
			meal.setMeal_rating(rs.getString(MEAL_RATING));
			meal.setMeal_chef_image_url(rs.getString(MEAL_CHEF_IMAGE_URL));
			meal.setMeal_time(rs.getString(MEAL_TIME));
			meal.setMeal_description(rs.getString(MEAL_DESCRIPTION));
			meal.setMeal_date(rs.getString(MEAL_DATE));
			meal.setMeal_cost(rs.getInt(MEAL_COST));
			return meal;
		}
		
	}

}
