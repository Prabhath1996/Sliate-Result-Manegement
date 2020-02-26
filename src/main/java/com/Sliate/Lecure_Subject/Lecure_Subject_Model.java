/**
 * 
 */
package com.Sliate.Lecure_Subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table (name ="Lecture_Subject")
public class Lecure_Subject_Model {

	@Id
	private String id;
	private String Lecture_Id;
	private String Subject_Id;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the lecture_Id
	 */
	public String getLecture_Id() {
		return Lecture_Id;
	}
	/**
	 * @param lecture_Id the lecture_Id to set
	 */
	public void setLecture_Id(String lecture_Id) {
		Lecture_Id = lecture_Id;
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
	
	
	
}
