package com.zensar.user;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import com.zensar.bean.City;
import com.zensar.bean.CovidCenter;

public class UserController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");

		 if (requestAction.equalsIgnoreCase("userViewAll")) {
			System.out.println("inside doget()");
			UserRepository userRepository = new UserRepository();
			List<City> listOfAllCities = userRepository.getAllCities();
			System.out.println(listOfAllCities);

			RequestDispatcher rd = request.getRequestDispatcher("userViewAllCity.jsp");
			request.setAttribute("listOfAllCities", listOfAllCities);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if (requestAction.equalsIgnoreCase("usercovidCenterDetails")) {
			System.out.println("inside doget()");
			
			int cityId = Integer.parseInt(request.getParameter("cityId"));
			UserRepository userRepository = new UserRepository();
			
			//CovidCenter covidCenter = cityRepository.details(cityId);
			List<CovidCenter> listOfAllCovidCenter = userRepository.userViewCovidCenter(cityId);
			
			System.out.println("in the covid center detail");
			System.out.println(listOfAllCovidCenter);

			RequestDispatcher rd = request.getRequestDispatcher("userViewCovidCenter.jsp");
			System.out.println("inside usercovid");
			request.setAttribute("listOfAllCovidCenter", listOfAllCovidCenter);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		doGet(request, response);
	}

}
