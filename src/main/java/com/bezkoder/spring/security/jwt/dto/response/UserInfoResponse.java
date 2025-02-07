package com.bezkoder.spring.security.jwt.dto.response;

import com.bezkoder.spring.security.jwt.models.User;

import java.time.LocalDate;

public class UserInfoResponse {
	private String uuid;
	private String username;
	private String email;
	private String cf;
	private String phoneNumber;
	private UserInfoResponse mother;
	private LocalDate birthdayDate;
	private UserInfoResponse father;
	private UserInfoResponse tutor;
	private String role;


	public static UserInfoResponse build(User entity){

		UserInfoResponse dto = new UserInfoResponse();
		dto.setUuid(entity.getUuid());
		dto.setUsername(entity.getUsername());
		dto.setEmail(entity.getEmail());
		dto.setCf(entity.getCf());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setMother(entity.getMother() != null ? UserInfoResponse.build(entity.getMother()) : null );
		dto.setFather(entity.getFather() != null ? UserInfoResponse.build(entity.getFather()) : null);
		dto.setTutor(entity.getTutor() != null ? UserInfoResponse.build(entity.getTutor()): null);
		dto.setRole(entity.getRole().getName().name());
		dto.setBirthdayDate(entity.getBirthdayDate().toLocalDate());
		return dto;
	}


	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserInfoResponse getMother() {
		return mother;
	}

	public void setMother(UserInfoResponse mother) {
		this.mother = mother;
	}

	public UserInfoResponse getFather() {
		return father;
	}

	public void setFather(UserInfoResponse father) {
		this.father = father;
	}

	public UserInfoResponse getTutor() {
		return tutor;
	}

	public void setTutor(UserInfoResponse tutor) {
		this.tutor = tutor;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
}
