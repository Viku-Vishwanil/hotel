package edu.jspiders.hotelbookingapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hotel_table")
public class HotelDTO implements Serializable
{		@Id
		@Column(name="sl_no")
		private int slNo;
		@Column(name="hotel_name")
		private String hotelName;
		@Column(name="city")
		private String city;
		@Column(name="state")
		private String state;
		@Column(name="no_of_rooms")
		private int noOfRooms;
		@Column(name="price_per_room")
		private int pricePerRoom;
		@Column(name="start_amount")
		private int startAmount;
		@Column(name="endt_amount")
		private int endAmount;
		
		public HotelDTO() {
			
		}

		public int getSlNo() {
			return slNo;
		}

		public void setSlNo(int slNo) {
			this.slNo = slNo;
		}

		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getNoOfRooms() {
			return noOfRooms;
		}

		public void setNoOfRooms(int noOfRooms) {
			this.noOfRooms = noOfRooms;
		}

		public int getPricePerRoom() {
			return pricePerRoom;
		}

		public void setPricePerRoom(int pricePerRoom) {
			this.pricePerRoom = pricePerRoom;
		}
		

		public int getStartAmount() {
			return startAmount;
		}

		public void setStartAmount(int startAmount) {
			this.startAmount = startAmount;
		}

		public int getEndAmount() {
			return endAmount;
		}

		public void setEndAmount(int endAmount) {
			this.endAmount = endAmount;
		}

		@Override
		public String toString() {
			return "HotelDTO [slNo=" + slNo + ", hotelName=" + hotelName + ", city=" + city + ", state=" + state
					+ ", noOfRooms=" + noOfRooms + ", pricePerRoom=" + pricePerRoom + "]";
		}

		
		
}
