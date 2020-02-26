package com.Sliate.ALSubject_List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="al_subject_list")
public class ALSubject_List {
	/**
	 * AL_sub_id is a primary key and Steam_id is a F key
	 */
	@Id
	String AL_sub_id;
	String AL_Sub_name;
	/**
	 * @return the aL_sub_id
	 */
	public String getAL_sub_id() {
		return AL_sub_id;
	}
	/**
	 * @param aL_sub_id the aL_sub_id to set
	 */
	public void setAL_sub_id(String aL_sub_id) {
		AL_sub_id = aL_sub_id;
	}
	/**
	 * @return the aL_Sub_name
	 */
	public String getAL_Sub_name() {
		return AL_Sub_name;
	}
	/**
	 * @param aL_Sub_name the aL_Sub_name to set
	 */
	public void setAL_Sub_name(String aL_Sub_name) {
		AL_Sub_name = aL_Sub_name;
	}

	
	
	

}
