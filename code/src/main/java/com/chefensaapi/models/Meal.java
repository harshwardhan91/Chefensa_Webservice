package com.chefensaapi.models;

public class Meal {

	private long meal_id;

	private String meal_title;

	private String meal_cusine_type;

	private String meal_image_url;

	private String meal_description;

	private String meal_rating;

	private long meal_count;
	
	private String meal_chef_id;

	private String meal_chef_name;

	private String meal_chef_image_url;

	private String meal_date;

	private String meal_type; // veg/non-veg

	private String meal_time; // lunch/dinner
	
	private int meal_cost;

	public int getMeal_cost() {
		return meal_cost;
	}

	public void setMeal_cost(int meal_cost) {
		this.meal_cost = meal_cost;
	}

	public long getMeal_count() {
		return meal_count;
	}

	public void setMeal_count(long meal_count) {
		this.meal_count = meal_count;
	}

	public String getMeal_date() {
		return meal_date;
	}

	public void setMeal_date(String meal_date) {
		this.meal_date = meal_date;
	}

	public String getMeal_type() {
		return meal_type;
	}

	public void setMeal_type(String meal_type) {
		this.meal_type = meal_type;
	}

	public String getMeal_time() {
		return meal_time;
	}

	public void setMeal_time(String meal_time) {
		this.meal_time = meal_time;
	}

	public long getMeal_id() {
		return meal_id;
	}

	public void setMeal_id(long meal_id) {
		this.meal_id = meal_id;
	}

	public String getMeal_title() {
		return meal_title;
	}

	public void setMeal_title(String meal_title) {
		this.meal_title = meal_title;
	}

	public String getMeal_cusine_type() {
		return meal_cusine_type;
	}

	public void setMeal_cusine_type(String meal_cusine_type) {
		this.meal_cusine_type = meal_cusine_type;
	}

	public String getMeal_image_url() {
		return meal_image_url;
	}

	public void setMeal_image_url(String meal_image_url) {
		this.meal_image_url = meal_image_url;
	}

	public String getMeal_description() {
		return meal_description;
	}

	public void setMeal_description(String meal_description) {
		this.meal_description = meal_description;
	}

	public String getMeal_rating() {
		return meal_rating;
	}

	public void setMeal_rating(String meal_rating) {
		this.meal_rating = meal_rating;
	}

	public String getMeal_chef_id() {
		return meal_chef_id;
	}

	public void setMeal_chef_id(String meal_chef_id) {
		this.meal_chef_id = meal_chef_id;
	}

	public String getMeal_chef_name() {
		return meal_chef_name;
	}

	public void setMeal_chef_name(String meal_chef_name) {
		this.meal_chef_name = meal_chef_name;
	}

	public String getMeal_chef_image_url() {
		return meal_chef_image_url;
	}

	public void setMeal_chef_image_url(String meal_chef_image_url) {
		this.meal_chef_image_url = meal_chef_image_url;
	}
}
