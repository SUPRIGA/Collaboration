package com.niit.collaboration.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int job_id;
	@Column
	private String job_designation;
	@Column
	private String job_details;
	@Column
	private String company_name;
	@Column
	private String address;
	
	
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_designation() {
		return job_designation;
	}
	public void setJob_designation(String job_designation) {
		this.job_designation = job_designation;
	}
	public String getJob_details() {
		return job_details;
	}
	public void setJob_details(String job_details) {
		this.job_details = job_details;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
