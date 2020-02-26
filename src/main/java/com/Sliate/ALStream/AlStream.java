package com.Sliate.ALStream;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@Table (name ="al_stream")
public class AlStream {

	/**
	 * primary key is Stream id
	 */
	@Id
	String Stream_Id;
	String Stream_Name;

	
	/**
	 * @return the stream_Id
	 */
	public String getStream_Id() {
		return Stream_Id;
	}
	/**
	 * @param stream_Id the stream_Id to set
	 */
	public void setStream_Id(String stream_Id) {
		Stream_Id = stream_Id;
	}
	/**
	 * @return the stream_Name
	 */
	public String getStream_Name() {
		return Stream_Name;
	}
	/**
	 * @param stream_Name the stream_Name to set
	 */
	public void setStream_Name(String stream_Name) {
		Stream_Name = stream_Name;
	}

	
}
