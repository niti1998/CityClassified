package com.zensar.bean;

public class CategoryMaster {
	int categoryId;
	String categoryName;

	public CategoryMaster() {

	}

	@Override
	public String toString() {
		return "CategoryMaster [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public CategoryMaster(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

}
