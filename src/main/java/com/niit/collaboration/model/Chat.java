package com.niit.collaboration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chat")
public class Chat {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int chat_id;
	@Column
	private int friend_id;
	@Column
	private String user_sender;
	@Column
	private String user_receiver;
	@Column
	private Date chat_date;
	
	
	
	public int getChat_id() {
		return chat_id;
	}
	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}

	public int getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(int friend_id) {
		this.friend_id = friend_id;
	}
	public String getUser_sender() {
		return user_sender;
	}
	public void setUser_sender(String user_sender) {
		this.user_sender = user_sender;
	}
	public String getUser_receiver() {
		return user_receiver;
	}
	public void setUser_receiver(String user_receiver) {
		this.user_receiver = user_receiver;
	}
	public Date getChat_date() {
		return chat_date;
	}
	public void setChat_date(Date chat_date) {
		this.chat_date = chat_date;
	}

	
	
	
}
