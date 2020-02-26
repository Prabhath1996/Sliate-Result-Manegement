/**
 * 
 */
package com.Sliate.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table(name ="Date")
public class Date_Model {

	@Id
	private String Id_Date;
	private String Date;
	/**
	 * @return the id_Date
	 */
	public String getId_Date() {
		return Id_Date;
	}
	/**
	 * @param id_Date the id_Date to set
	 */
	public void setId_Date(String id_Date) {
		Id_Date = id_Date;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}
	
}
