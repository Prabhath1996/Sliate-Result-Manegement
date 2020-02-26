/**
 * 
 */
package com.Sliate.Attempt;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table(name ="Attempt")
public class Attempt_Module {
	
	@Id
	private String Attemts_Id;
	private String Attempt;
	/**
	 * @return the attemts_Id
	 */
	public String getAttemts_Id() {
		return Attemts_Id;
	}
	/**
	 * @param attemts_Id the attemts_Id to set
	 */
	public void setAttemts_Id(String attemts_Id) {
		Attemts_Id = attemts_Id;
	}
	/**
	 * @return the attempt
	 */
	public String getAttempt() {
		return Attempt;
	}
	/**
	 * @param attempt the attempt to set
	 */
	public void setAttempt(String attempt) {
		Attempt = attempt;
	}
	
	

}
