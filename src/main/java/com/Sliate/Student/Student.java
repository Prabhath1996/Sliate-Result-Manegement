package com.Sliate.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
@Table (name ="Student")
public class Student {
	/**
	 * REG_No is the primary key
	 */
	@Id
	String Reg_No;
	String Title; // ( Mrs or Mis)
	String Initial_Name;
	String First_Name;
	String Middle_Name;
	String Last_Name;
	String NIC;
	String Birth_Day;
	String Course_Name;
	String Gender;
	String AL_Stream;
	String Phone_Number;
	String Address;
	String ResultReslese; // That mean 1,2,3 time
	
	/**
	 * @return the reg_No
	 */
	public String getReg_No() {
		return Reg_No;
	}
	/**
	 * @param reg_No the reg_No to set
	 */
	public void setReg_No(String reg_No) {
		Reg_No = reg_No;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the initial_Name
	 */
	public String getInitial_Name() {
		return Initial_Name;
	}
	/**
	 * @param initial_Name the initial_Name to set
	 */
	public void setInitial_Name(String initial_Name) {
		Initial_Name = initial_Name;
	}
	/**
	 * @return the first_Name
	 */
	public String getFirst_Name() {
		return First_Name;
	}
	/**
	 * @param first_Name the first_Name to set
	 */
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	/**
	 * @return the middle_Name
	 */
	public String getMiddle_Name() {
		return Middle_Name;
	}
	/**
	 * @param middle_Name the middle_Name to set
	 */
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return Last_Name;
	}
	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
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
	 * @return the birth_Day
	 */
	public String getBirth_Day() {
		return Birth_Day;
	}
	/**
	 * @param birth_Day the birth_Day to set
	 */
	public void setBirth_Day(String birth_Day) {
		Birth_Day = birth_Day;
	}
	/**
	 * @return the course_Name
	 */
	public String getCourse_Name() {
		return Course_Name;
	}
	/**
	 * @param course_Name the course_Name to set
	 */
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the aL_Stream
	 */
	public String getAL_Stream() {
		return AL_Stream;
	}
	/**
	 * @param aL_Stream the aL_Stream to set
	 */
	public void setAL_Stream(String aL_Stream) {
		AL_Stream = aL_Stream;
	}
	/**
	 * @return the phone_Number
	 */
	public String getPhone_Number() {
		return Phone_Number;
	}
	/**
	 * @param phone_Number the phone_Number to set
	 */
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the resultReslese
	 */
	public String getResultReslese() {
		return ResultReslese;
	}
	/**
	 * @param resultReslese the resultReslese to set
	 */
	public void setResultReslese(String resultReslese) {
		ResultReslese = resultReslese;
	}
	
	

}
