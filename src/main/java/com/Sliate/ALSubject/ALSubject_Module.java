package com.Sliate.ALSubject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="al_subject")
public class ALSubject_Module {
	/**
	 * Subject_Id is a primary key and Steam_id is a F key
	 */
	@Id
	String Subject_Id;
	String Steam_id;
	String Al_subject;
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
	 * @return the steam_id
	 */
	public String getSteam_id() {
		return Steam_id;
	}
	/**
	 * @param steam_id the steam_id to set
	 */
	public void setSteam_id(String steam_id) {
		Steam_id = steam_id;
	}
	/**
	 * @return the al_subject
	 */
	public String getAl_subject() {
		return Al_subject;
	}
	/**
	 * @param al_subject the al_subject to set
	 */
	public void setAl_subject(String al_subject) {
		Al_subject = al_subject;
	}
	
	

}
