package com.niit.collaboration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friendlist")
public class FriendList {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int friendlist_id;
	@Column
	private String friend_name;
	@Column
	private String email_id;
	@Column
	private int mobile_number;
	
	
	
	
	public int getFriendlist_id() {
		return friendlist_id;
	}
	public void setFriendlist_id(int friendlist_id) {
		this.friendlist_id = friendlist_id;
	}
	public String getFriend_name() {
		return friend_name;
	}
	public void setFriend_name(String friend_name) {
		this.friend_name = friend_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	

	
	
	
	

}
