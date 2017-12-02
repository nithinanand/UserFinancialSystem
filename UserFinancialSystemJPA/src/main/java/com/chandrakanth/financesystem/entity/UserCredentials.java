package com.chandrakanth.financesystem.entity;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="UC")
@Table(name="USERCREDENTIALS")
@Access(value = javax.persistence.AccessType.PROPERTY)
public class UserCredentials {

	@Id
	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="PASS_WORD" )
	public String getPassWord() {
		return passWord;
	}

	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
	private String userName;
	
	
	private String passWord;
	
	
	
}
