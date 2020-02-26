/**
 * 
 */
package com.Sliate.Attendants;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table (name ="Attendants")
public class Attendants_Model {

	@Id
	private String Attendants_Id;
	private String Subject_Id;
	private String Time_Id;
	private String Date_Id;
	private String Student_id;
	/**
	 * @return the attendants_Id
	 */
	public String getAttendants_Id() {
		return Attendants_Id;
	}
	/**
	 * @param attendants_Id the attendants_Id to set
	 */
	public void setAttendants_Id(String attendants_Id) {
		Attendants_Id = attendants_Id;
	}
	/**
	 * @return the subject_Id
	 */
	public String getSubject_Id() {
		return Subject_Id;
	}
	/**
	 * @param subject_Id the subject_Id to set
	 */
	public void setSubject_Id(String subject_Id) {
		Subject_Id = subject_Id;
	}
	/**
	 * @return the time_Id
	 */
	public String getTime_Id() {
		return Time_Id;
	}
	/**
	 * @param time_Id the time_Id to set
	 */
	public void setTime_Id(String time_Id) {
		Time_Id = time_Id;
	}
	/**
	 * @return the date_Id
	 */
	public String getDate_Id() {
		return Date_Id;
	}
	/**
	 * @param date_Id the date_Id to set
	 */
	public void setDate_Id(String date_Id) {
		Date_Id = date_Id;
	}
	/**
	 * @return the student_id
	 */
	public String getStudent_id() {
		return Student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(String student_id) {
		Student_id = student_id;
	}
	
	
}
