package com.Sliate.Student_Result;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@Table(name ="Student_Result")
public class Student_Result_Model {

	@Id 
	private String Result_id;
	private String  Reg_no;
	private String  Subject_Id;
	private String  result;
	/**
	 * @return the resulut_id
	 */
	public String getResult_id() {
		return Result_id;
	}
	/**
	 * @param resulut_id the resulut_id to set
	 */
	public void setResult_id(String resulut_id) {
		Result_id = resulut_id;
	}
	/**
	 * @return the reg_no
	 */
	public String getReg_no() {
		return Reg_no;
	}
	/**
	 * @param reg_no the reg_no to set
	 */
	public void setReg_no(String reg_no) {
		Reg_no = reg_no;
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
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	

}
