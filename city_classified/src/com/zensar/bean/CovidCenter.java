package com.zensar.bean;

public class CovidCenter {
	
	private int cityId;
	private int hospitalId;
	private String hospitalName;
	private int noOfBeds;
	private int hospitalPhoneNumber;

	public CovidCenter() {
		
	}
	 

 


	public CovidCenter(int cityId, int hospitalId, String hospitalName, int noOfBeds, int hospitalPhoneNumber) {
		super();
		this.cityId = cityId;
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.noOfBeds = noOfBeds;
		this.hospitalPhoneNumber = hospitalPhoneNumber;
	}





	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public int getHospitalId() {
		return hospitalId;
	}


	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}


	public String getHospitalName() {
		return hospitalName;
	}


	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}


	public int getNoOfBeds() {
		return noOfBeds;
	}


	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}



	public int getHospitalPhoneNumber() {
		return hospitalPhoneNumber;
	}





	public void setHospitalPhoneNumber(int hospitalPhoneNumber) {
		this.hospitalPhoneNumber = hospitalPhoneNumber;
	}





	@Override
	public String toString() {
		return "CovidCenter [cityId=" + cityId + ", hospitalId=" + hospitalId + ", hospitalName=" + hospitalName
				+ ", noOfBeds=" + noOfBeds + ", hospitalPhoneNumber=" + hospitalPhoneNumber + "]";
	}


	

 
	
	
}
