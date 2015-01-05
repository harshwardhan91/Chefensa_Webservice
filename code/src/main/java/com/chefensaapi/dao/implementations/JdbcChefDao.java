package com.chefensaapi.dao.implementations;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.chefensaapi.dao.ChefDao;
import com.chefensaapi.models.Chef;

public class JdbcChefDao implements ChefDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public final String CHEF_ID="chefId";
	public final String CHEF_NAME="chefName";
	public final String CHEF_SPECIALITY="chefSpeciality";
	public final String CHEF_IMAGE_URL="chefImageUrl";
	public final String CHEF_RATING="chefRating";
	public final String CHEF_MEAL_COUNT="chefMealCount";
	public final String CHEF_DESCRIPTION="chefDescription";

	public void setDataSOurce(DataSource dataSource) {
		this.dataSource = dataSource;	
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Chef getChefInfo(long chef_id) {
		Chef chef= new Chef();
		String query = "select * from Chef where " + CHEF_ID + " = ?";
		chef = jdbcTemplate.queryForObject(query, new Object[]{chef_id}, new ChefMapper());
		return chef;
	}
	
	public class ChefMapper implements RowMapper<Chef>{

		public Chef mapRow(ResultSet rs, int arg1) throws SQLException {
			Chef chef = new Chef();
			chef.setChefId(rs.getInt(CHEF_ID));
			chef.setChefName(rs.getString(CHEF_NAME));
			chef.setChefSpeciality(rs.getString(CHEF_SPECIALITY));
			chef.setChefImageUrl(rs.getString(CHEF_IMAGE_URL));
			chef.setChefRating(rs.getString(CHEF_RATING));
			chef.setChefMealCount(rs.getInt(CHEF_MEAL_COUNT));
			chef.setChefDescription(rs.getString(CHEF_DESCRIPTION));
			return chef;
		}
		
	}

}
