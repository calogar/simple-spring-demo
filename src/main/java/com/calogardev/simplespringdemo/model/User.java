package com.calogardev.simplespringdemo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.calogardev.simplespringdemo.enums.GenderEnum;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -7068547766739353586L;

	@Id
	@GeneratedValue
	private Integer id;

	private String username;

	private String password;

	@Enumerated(EnumType.STRING)
	private GenderEnum gender;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;

	public User() {
	}

	public User(String username, String password, GenderEnum gender) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.lastUpdated = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ ", lastUpdated=" + lastUpdated + "]";
	}
}
