/**
 * 
 */
package com.Sliate.Lecture;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */

@Entity
@Table(name ="Lecture")
public class Lecture_Model {

	@Id
	private String LectureId;
	private String Name;
	private String NIC;
	private String Email;
	private String password;
	/**
	 * @return the lectureId
	 */
	public String getLectureId() {
		return LectureId;
	}
	/**
	 * @param lectureId the lectureId to set
	 */
	public void setLectureId(String lectureId) {
		LectureId = lectureId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the nIC
	 */
	public String getNIC() {
		return NIC;
	}
	/**
	 * @param nIC the nIC to set
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
