package com.zensar.admin;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import com.zensar.bean.*;

public class CityController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");

		if (requestAction.equalsIgnoreCase("delete")) {

			CityRepository cityRepository = new CityRepository();
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			cityRepository.deleteCity(cityId);

			// RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			try {
				// rd.forward(req, res);
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}
		}

		else if (requestAction.equalsIgnoreCase("viewAll")) {
			System.out.println("inside doget()");
			CityRepository cityRepository = new CityRepository();
			List<City> listOfAllCities = cityRepository.getAllCities();
			System.out.println(listOfAllCities);

			RequestDispatcher rd = request.getRequestDispatcher("viewAllCity.jsp");
			request.setAttribute("listOfAllCities", listOfAllCities);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if (requestAction.equalsIgnoreCase("viewBusinessListing")) {
			System.out.println("inside doget()");
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
			CityRepository cityRepository = new CityRepository();
			List<BusinessListing> listOfBusinessListing = cityRepository.viewBusinessListing(cityId, categoryId);
			System.out.println(listOfBusinessListing);

			RequestDispatcher rd = request.getRequestDispatcher("viewBusinessListing.jsp");
			request.setAttribute("listOfBusinessListing", listOfBusinessListing);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		else if (requestAction.equalsIgnoreCase("covidCenterDetails")) {
			System.out.println("inside doget()");
			
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			CityRepository cityRepository = new CityRepository();
			
			//CovidCenter covidCenter = cityRepository.details(cityId);
			List<CovidCenter> listOfAllCovidCenter = cityRepository.viewCovidCenter(cityId);
			
			System.out.println("in the covid center detail");
			System.out.println(listOfAllCovidCenter);

			RequestDispatcher rd = request.getRequestDispatcher("viewCovidCenter.jsp");
			request.setAttribute("listOfAllCovidCenter", listOfAllCovidCenter);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

		else if (requestAction.equalsIgnoreCase("login")) {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			CityRepository cityRepository = new CityRepository();

			boolean loginResult = cityRepository.checkLogin(userName, password);
			if (loginResult) {
				try {
					response.sendRedirect("index.jsp");
				} catch (Exception e) {
					System.out.println("Exception Occured:" + e);
				}
			} else {
				request.setAttribute("errorMessage", "Invalid Username/Password");
			}
			try {

				// res.sendRedirect("login.jsp");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				try {
					rd.forward(request, response);
				} catch (Exception e) {

				}

			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}
		}
		
		
		else if (requestAction.equalsIgnoreCase("addCovid")) {

			System.out.println("this is it addcovid center ciri");
			
			
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			int hospitalId = Integer.parseInt(request.getParameter("hospitalId"));
			String hospitalName= request.getParameter("hospitalName");
			int noOfBeds = Integer.parseInt(request.getParameter("noOfBeds"));
			int hospitalPhoneNumber = Integer.parseInt(request.getParameter("hospitalPhoneNumber"));			
			
			CityRepository cityRepository = new CityRepository();
			CovidCenter covidCenter = new CovidCenter(cityId, hospitalId, hospitalName, noOfBeds, hospitalPhoneNumber);		
			cityRepository.addCovidCenter(covidCenter);;
			System.out.println("ciri :"+cityId);
			try {
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
		}
		
		

		else if (requestAction.equalsIgnoreCase("addBusinessListing")) {

			System.out.println("this is it addbusinesss center ciri");
			
			
			int listingId = Integer.parseInt(request.getParameter("listingId"));
			String businessName= request.getParameter("businessName");
			String businessDiscription = request.getParameter("businessDiscription");
			String address = request.getParameter("address");
			
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));

			CityRepository cityRepository = new CityRepository();
			BusinessListing businessListing = new BusinessListing(listingId, businessName, businessDiscription, address, cityId, categoryId);
			
			cityRepository.addBusinessListing(businessListing);;
			System.out.println("ciri :"+cityId);
			try {
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
		}

		else if (requestAction.equalsIgnoreCase("addCategoryMaster")) {

			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
			String categoryName = request.getParameter("categoryName");

			System.out.println("ciri" +  categoryId);
			CityRepository cityRepository = new CityRepository();
			CategoryMaster categoryMaster = new  CategoryMaster(categoryId, categoryName);
			cityRepository.addCategoryMaster(categoryMaster);

			try {
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		else if (requestAction.equalsIgnoreCase("add")) {

			int cityId = Integer.parseInt(request.getParameter("cityId"));
			String cityName = request.getParameter("cityName");

			System.out.println(cityId + "  " + cityName);

			CityRepository cityRepository = new CityRepository();
			City city = new City(cityId, cityName);
			cityRepository.addCity(city);

			try {
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		else if (requestAction.equalsIgnoreCase("openUpdateForm")) {

			int hospitalId = Integer.parseInt(request.getParameter("hospitalId"));
			CityRepository cityRepository = new CityRepository();
			CovidCenter covidCenter = cityRepository.updateCovidCenter(hospitalId);

			RequestDispatcher rd = request.getRequestDispatcher("updateCovidCenter.jsp");
			request.setAttribute("covidCenter", covidCenter);
			try {
				rd.forward(request, response);
				// res.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}
		}
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		doGet(request, response);
	}

}
