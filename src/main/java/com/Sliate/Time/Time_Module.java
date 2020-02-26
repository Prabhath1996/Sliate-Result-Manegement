/**
 * 
 */
package com.Sliate.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table(name="Time")
public class Time_Module {

	@Id
	private String Time_ID;
	private String Discription;
	/**
	 * @return the time_ID
	 */
	public String getTime_ID() {
		return Time_ID;
	}
	/**
	 * @param time_ID the time_ID to set
	 */
	public void setTime_ID(String time_ID) {
		Time_ID = time_ID;
	}
	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return Discription;
	}
	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		Discription = discription;
	}
	
	
	
}
