/**
 * 
 */
package com.Sliate.Subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */

@Entity
@Table (name="Subject")
public class Subject_Model {

	@Id
	private String SubjectId;
	private String Course;
	private String SemesterId;
	private String SubjectCode;
	private String Credit;
	private String Name;
	/**
	 * @return the subjectId
	 */
	public String getSubjectId() {
		return SubjectId;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(String subjectId) {
		SubjectId = subjectId;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return Course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		Course = course;
	}
	/**
	 * @return the semesterId
	 */
	public String getSemesterId() {
		return SemesterId;
	}
	/**
	 * @param semesterId the semesterId to set
	 */
	public void setSemesterId(String semesterId) {
		SemesterId = semesterId;
	}
	/**
	 * @return the subjectCode
	 */
	public String getSubjectCode() {
		return SubjectCode;
	}
	/**
	 * @param subjectCode the subjectCode to set
	 */
	public void setSubjectCode(String subjectCode) {
		SubjectCode = subjectCode;
	}
	/**
	 * @return the credit
	 */
	public String getCredit() {
		return Credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(String credit) {
		Credit = credit;
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
	
	
	
}
