package edu.jspiders.hotelbookingapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.hotelbookingapp.dao.HotelDAOImpl;
import edu.jspiders.hotelbookingapp.dao.UserDAOImpl;
import edu.jspiders.hotelbookingapp.dto.HotelDTO;


@Controller
public class MyController 
{
	@Autowired
	private UserDAOImpl dao;
	
	@Autowired
	private HotelDAOImpl hotel;
	
	@RequestMapping("/home")
	public String getHomePage()
	{
		return"home";
	}
	@RequestMapping("/login")
	public String getLoginForm()
	{
		return"login";
	}
	@RequestMapping("/logindata")
	public String getLoginFormData(HttpServletRequest req)
	{
		String user = req.getParameter("username");
		String password = req.getParameter("pswd");
		
		if(dao.validate(user,password))
		{
			return "home";
		}
		else
		{
			return "redirect:/login";
		}
	}
	@RequestMapping("/addhotel")
	public String getAddHotel()
	{
		return"addhotel";
	}
	@RequestMapping("/savehotel")
	public String saveHotel(HttpServletRequest req)
	{
		String slno = req.getParameter("slno");
		String hname = req.getParameter("hname");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String noOfRooms = req.getParameter("noOfRooms");
		String pricePerRoom = req.getParameter("pricePerRoom");
		String startAmount=req.getParameter("startAmount");
		String endAmount=req.getParameter("endAmount");
		
		HotelDTO hoteldto = new HotelDTO();
		
		hoteldto.setSlNo(Integer.parseInt(slno));
		hoteldto.setHotelName(hname);
		hoteldto.setCity(city);
		hoteldto.setState(state);
		hoteldto.setNoOfRooms(Integer.parseInt(noOfRooms));
		hoteldto.setPricePerRoom(Integer.parseInt(pricePerRoom));
		hoteldto.setStartAmount(Integer.parseInt(startAmount));
		hoteldto.setEndAmount(Integer.parseInt(endAmount));
		
		hotel.createHotel(hoteldto);
		
		 return "success";
	}
	@RequestMapping("/search") 
	public String getHotel()
	{
		return "searchhotel";
	}
	
	@RequestMapping("/searchhotel")
	public String getTrainInfo(HttpServletRequest req, Model myModel)
	{
		String startAmount = req.getParameter("startAmount");
		String endAmount = req.getParameter("endAmount");
		
		List<HotelDTO> hotelInfo = hotel.searchHotel(startAmount, endAmount);
		
		myModel.addAttribute("hotelsInfo",hotelInfo);
		
		return "showdata";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return"logout";
	}
}
