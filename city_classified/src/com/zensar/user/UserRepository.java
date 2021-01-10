package com.zensar.user;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.zensar.bean.City;
import com.zensar.bean.CovidCenter;
import com.zensar.utility.*;

public class UserRepository {
	
	
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
	
	public List<CovidCenter>userViewCovidCenter(int cityId){
		List<CovidCenter> listOfAllCovidCenter = new ArrayList<CovidCenter>();
		Connection con=DBUtil.getDbConnection();
		String sql = "SELECT * FROM covid_centre INNER JOIN city ON covid_centre.city_id = city.city_id where city.city_id=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cityId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			
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
	
}
