package com.zensar.admin;
import java.sql.*;

import com.zensar.bean.*;
import com.zensar.utility.DBUtil;
import java.util.*;

public class CityRepository {
	
	public void addCity(City city) {
		Connection con =DBUtil.getDbConnection();
		
		String sql = "insert into city values (?,?)";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, city.getCityId());
		ps.setString(2, city.getCityName());
		int result = ps.executeUpdate();
		if(result == 0) {
			System.out.println("insertion of city failed");
		}
		else
		{
			System.out.println("insertion of city succesful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addCategoryMaster(CategoryMaster categoryMaster) {
		Connection con =DBUtil.getDbConnection();
		
		String sql = "insert into category_master values (?,?)";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, categoryMaster.getCategoryId());
		ps.setString(2, categoryMaster.getCategoryName());
		int result = ps.executeUpdate();
		if(result == 0) {
			System.out.println("insertion of category failed");
		}
		else
		{
			System.out.println("insertion of category succesful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addCovidCenter(CovidCenter covidCenter){
		Connection con =DBUtil.getDbConnection();
		String sql = "insert into covid_centre(city_id, hospital_id, hospital_name, no_of_beds, hospital_phone_number) values (?,?,?,?,?) ";
		
		try {
		//	PreparedStatement ps = con.prepareStatement(sql1);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, covidCenter.getCityId());
		ps.setInt(2, covidCenter.getHospitalId());
		ps.setString(3, covidCenter.getHospitalName());
		ps.setInt(4, covidCenter.getNoOfBeds());
		ps.setInt(5, covidCenter.getHospitalPhoneNumber());
		int result = ps.executeUpdate();
		if(result == 0) {
			System.out.println("insertion of covid center failed");
		}
		else
		{
			System.out.println("insertion of covid center succesful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void addBusinessListing(BusinessListing businessListing){
		Connection con =DBUtil.getDbConnection();
		//nsert into table2 (UserID, PostID, Title, Summary)" + "values (UserID, ?, ?, ?)"); 
		
		//String sql1 = "select city_id from business_listing;";
		String sql = "insert into business_listing(listing_id, business_name, business_discription, address, city_id, category_id) values (?,?,?,?,?,?) ";
		
		try {
		//	PreparedStatement ps = con.prepareStatement(sql1);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, businessListing.getListingId());
		ps.setString(2, businessListing.getBusinessName());
		ps.setString(3, businessListing.getBusinessDiscription());
		ps.setString(4, businessListing.getAddress());
		ps.setInt(5, businessListing.getCityId());
		ps.setInt(6, businessListing.getCategoryId());
		int result = ps.executeUpdate();
		if(result == 0) {
			System.out.println("insertion of business listing failed");
		}
		else
		{
			System.out.println("insertion of businesslisting succesful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<City> getAllCities(){
		List<City> listOfAllCities = new ArrayList<City>();
		Connection con = DBUtil.getDbConnection();
		String sql = "select * from city";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int cityId = rs.getInt("city_id");
				String cityName = rs.getString("city_name");
				City city = new City(cityId, cityName);
				listOfAllCities.add(city);	
				
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}

		return listOfAllCities;
	
	}
	public void deleteCity(int cityId) {
		Connection con =DBUtil.getDbConnection();
		String sql = "delete from city where city_id=?";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, cityId);
		int result = ps.executeUpdate();
		if(result==0) {
			System.out.println("deletion failed");
		}
		else {
			System.out.println("deleted successful");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public boolean checkLogin(String userName,String password) {
        boolean result=false;
        Connection con=DBUtil.getDbConnection();
        String sql="select * from admin_login where user_name=?";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,userName);
             ResultSet rs=pst.executeQuery();
             while(rs.next()) {
                 String passwordFromDb = rs.getString("password");
                 if(password.equals(passwordFromDb)){
                     result=true;
                 }
             }
        }catch(Exception e) {
             e.printStackTrace();
         }
     return result;
    }
	
	public List<CovidCenter>viewCovidCenter(int cityId){
		List<CovidCenter> listOfAllCovidCenter = new ArrayList<CovidCenter>();
		Connection con = DBUtil.getDbConnection();
		String sql = "SELECT * FROM covid_centre INNER JOIN city ON covid_centre.city_id = city.city_id where city.city_id=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cityId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			//	int cityId = rs.getInt("city_id");
				int hospitalId = rs.getInt("hospital_id");
				String hospitalName = rs.getString("hospital_name");
				int noOfBeds = rs.getInt("no_of_beds");
				int hospitalPhoneNumber = rs.getInt("hospital_phone_number");
				CovidCenter covidCenter = new CovidCenter(cityId, hospitalId, hospitalName, noOfBeds, hospitalPhoneNumber);
				listOfAllCovidCenter.add(covidCenter);				
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listOfAllCovidCenter;
	
	}
	
	
	public List<BusinessListing>viewBusinessListing(int cityId, int categoryId){
		List<BusinessListing> listOfBusinessListing = new ArrayList<BusinessListing>();
		Connection con = DBUtil.getDbConnection();
		String sql = "select * from business_listing where business_listing.city_id=? and business_listing.category_id=?;" ;
				
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cityId);
			ps.setInt(2, categoryId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			//	int cityId = rs.getInt("city_id");
				int listingId = rs.getInt("listing_id");
				String businessName = rs.getString("business_name");
				String businessDiscription = rs.getString("business_discription");
				String address = rs.getString("address");
				BusinessListing businessListing = new BusinessListing(listingId, businessName, businessDiscription, address, cityId, categoryId);
				listOfBusinessListing.add(businessListing);				
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listOfBusinessListing;
	
	}
	
	
	public CovidCenter updateCovidCenter(int hospitalId) {
		CovidCenter covidCenter = null;
		Connection con = DBUtil.getDbConnection();
		String sql = "SELECT * FROM covid_centre INNER JOIN city ON covid_centre.city_id = city.city_id where covid_centre.hospital_id=?;";
		try {
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setInt(1, hospitalId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int cityId = rs.getInt("city_id");
			String hospitalName = rs.getString("hospital_name");
			int noOfBeds = rs.getInt("no_of_beds");
			int hospitalPhoneNumber = rs.getInt("hospital_phone_number");
			covidCenter = new CovidCenter(cityId, hospitalId, hospitalName, noOfBeds, hospitalPhoneNumber);
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return covidCenter;
	}
	
	
}
