package com.niit.collaboration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int event_id;
	@Column
	private String event_name;
	@Column
	private String event_content;
	@Column
	private String event_details;
	@Column
	private Date event_date;
	
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_content() {
		return event_content;
	}
	public void setEvent_content(String event_content) {
		this.event_content = event_content;
	}
	public String getEvent_details() {
		return event_details;
	}
	public void setEvent_details(String event_details) {
		this.event_details = event_details;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	

}
