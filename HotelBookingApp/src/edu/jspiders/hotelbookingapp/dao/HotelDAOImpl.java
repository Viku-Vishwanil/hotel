package edu.jspiders.hotelbookingapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import edu.jspiders.hotelbookingapp.dto.HotelDTO;

@Component
public class HotelDAOImpl
{
	public void createHotel(HotelDTO hotel)
	{ 
		
		Configuration config = new Configuration().configure().addAnnotatedClass(HotelDTO.class);
	
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(hotel);
		tx.commit();
		
		session.close();
		factory.close();
	}
	public List<HotelDTO> searchHotel(String startAmount, String endAmount) 
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(HotelDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM HotelDTO where startAmount = :startAmount and endAmount = :endAmount";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("startAmount", startAmount);
		query.setParameter("endAmount", endAmount);
		
		List<HotelDTO> hotelDTOs = (List<HotelDTO>)query.list();
		
		session.close();
		
		return hotelDTOs;
	}
	
}
