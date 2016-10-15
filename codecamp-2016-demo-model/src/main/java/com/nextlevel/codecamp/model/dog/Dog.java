package com.nextlevel.codecamp.model.dog;

public class Dog {
	
	private String name;
	private String favoriteToy;
	private String description;
	private boolean goodDog;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFavoriteToy() {
		return favoriteToy;
	}
	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isGoodDog() {
		return goodDog;
	}
	public void setGoodDog(boolean goodDog) {
		this.goodDog = goodDog;
	}
	
}
