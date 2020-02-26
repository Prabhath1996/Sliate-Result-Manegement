package com.Sliate.Semester;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Semester")
public class Semester_model {

	@javax.persistence.Id
	private String Id;
	private String Semester;
	private String year;
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the semester
	 */
	public String getSemester() {
		return Semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		Semester = semester;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
