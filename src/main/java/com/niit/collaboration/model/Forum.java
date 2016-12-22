package com.niit.collaboration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forum")
public class Forum {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int forum_id;
	@Column
	private String user_name;
	@Column
	private String forum_title;
	@Column
	private String forum_comment;
	@Column
	private String forum_date;
	
	
	public int getForum_id() {
		return forum_id;
	}
	public void setForum_id(int forum_id) {
		this.forum_id = forum_id;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getForum_title() {
		return forum_title;
	}
	public void setForum_title(String forum_title) {
		this.forum_title = forum_title;
	}
	public String getForum_comment() {
		return forum_comment;
	}
	public void setForum_comment(String forum_comment) {
		this.forum_comment = forum_comment;
	}
	public String getForum_date() {
		return forum_date;
	}
	public void setForum_date(String forum_date) {
		this.forum_date = forum_date;
	}
	
	
	
	

}
