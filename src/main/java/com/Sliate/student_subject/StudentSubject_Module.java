/**
 * 
 */
package com.Sliate.student_subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhath
 *
 */
@Entity
@Table(name ="Student_Subject")
public class StudentSubject_Module {

	@Id
	private String StudentSubjectId;
	private String Student_Id;
	private String Subject_Id;
	private String Attempt_Id;
	private String Course_Id;
	private String Attendants;
	private String Assignment;
	private String examMarks;
	private String Elibility_State;
	private String Year;
	/**
	 * @return the studentSubjectId
	 */
	public String getStudentSubjectId() {
		return StudentSubjectId;
	}
	/**
	 * @param studentSubjectId the studentSubjectId to set
	 */
	public void setStudentSubjectId(String studentSubjectId) {
		StudentSubjectId = studentSubjectId;
	}
	/**
	 * @return the student_Id
	 */
	public String getStudent_Id() {
		return Student_Id;
	}
	/**
	 * @param student_Id the student_Id to set
	 */
	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
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
	 * @return the attempt_Id
	 */
	public String getAttempt_Id() {
		return Attempt_Id;
	}
	/**
	 * @param attempt_Id the attempt_Id to set
	 */
	public void setAttempt_Id(String attempt_Id) {
		Attempt_Id = attempt_Id;
	}
	/**
	 * @return the course_Id
	 */
	public String getCourse_Id() {
		return Course_Id;
	}
	/**
	 * @param course_Id the course_Id to set
	 */
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	/**
	 * @return the attendants
	 */
	public String getAttendants() {
		return Attendants;
	}
	/**
	 * @param attendants the attendants to set
	 */
	public void setAttendants(String attendants) {
		Attendants = attendants;
	}
	/**
	 * @return the assignment
	 */
	public String getAssignment() {
		return Assignment;
	}
	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(String assignment) {
		Assignment = assignment;
	}
	/**
	 * @return the examMarks
	 */
	public String getExamMarks() {
		return examMarks;
	}
	/**
	 * @param examMarks the examMarks to set
	 */
	public void setExamMarks(String examMarks) {
		this.examMarks = examMarks;
	}
	/**
	 * @return the elibility_State
	 */
	public String getElibility_State() {
		return Elibility_State;
	}
	/**
	 * @param elibility_State the elibility_State to set
	 */
	public void setElibility_State(String elibility_State) {
		Elibility_State = elibility_State;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return Year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		Year = year;
	}
	
	
}
