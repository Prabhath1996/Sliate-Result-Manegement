package com.Sliate.Renewal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Renewal")
public class Renewal_Model {

	@Id
	private String Renewal_Id;
	private String Discription;
	private String Exam_Form;
	private String Student_Id;
	private String Course_Id;
	private String Semester_Id;
	
	/**
	 * @return the renewal_Id
	 */
	public String getRenewal_Id() {
		return Renewal_Id;
	}
	/**
	 * @param renewal_Id the renewal_Id to set
	 */
	public void setRenewal_Id(String renewal_Id) {
		Renewal_Id = renewal_Id;
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
	/**
	 * @return the exam_Form
	 */
	public String getExam_Form() {
		return Exam_Form;
	}
	/**
	 * @param exam_Form the exam_Form to set
	 */
	public void setExam_Form(String exam_Form) {
		Exam_Form = exam_Form;
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
	 * @return the semester_Id
	 */
	public String getSemester_Id() {
		return Semester_Id;
	}
	/**
	 * @param semester_Id the semester_Id to set
	 */
	public void setSemester_Id(String semester_Id) {
		Semester_Id = semester_Id;
	}
	
	
}
