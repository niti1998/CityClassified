package com.zensar.bean;

public class BusinessListing {

	private int listingId;
	private String businessName;
	private String businessDiscription;
	private String address;
	private int cityId;
	private int categoryId;
	
	public BusinessListing()
	{
		
	}

	public int getListingId() {
		return listingId;
	}

	public void setListingId(int listingId) {
		this.listingId = listingId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessDiscription() {
		return businessDiscription;
	}

	public void setBusinessDiscription(String businessDiscription) {
		this.businessDiscription = businessDiscription;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "BusinessListing [listingId=" + listingId + ", businessName=" + businessName + ", businessDiscription="
				+ businessDiscription + ", address=" + address + ", cityId=" + cityId + ", categoryId=" + categoryId
				+ "]";
	}

	public BusinessListing(int listingId, String businessName, String businessDiscription, String address, int cityId,
			int categoryId) {
		super();
		this.listingId = listingId;
		this.businessName = businessName;
		this.businessDiscription = businessDiscription;
		this.address = address;
		this.cityId = cityId;
		this.categoryId = categoryId;
	}
	
}
