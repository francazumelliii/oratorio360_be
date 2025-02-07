package com.bezkoder.spring.security.jwt.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import com.bezkoder.spring.security.jwt.models.embedded.EventParticipants;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "username"),
           @UniqueConstraint(columnNames = "email")
       })
public class User extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String uuid;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  // TODO verify refreshToken storage
  // TODO verify GrantAuthorities and Role assigment
  // TODO change ENUMS by removing "ROLE_" prefix

  @NotBlank
  @Size(max = 120)
  private String password;

  @Column(unique = true, nullable = false)
  private String cf;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String surname;

  @Column(nullable = false)
  private char gender;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name="birthday_date", nullable = false)
  private Date birthdayDate;

  @Column(name="residence_address", nullable = false)
  private String residenceAddress;

  @Column(name="domicile_address", nullable = false)
  private String domicileAddress;

  @Column(name="pwd_updated_at")
  private Timestamp pwdUpdatedAt;



  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="role_id")
  private Role role;


  @OneToMany(mappedBy="createdBy")
  private Set<Space> createdSpaces;

  @OneToMany(mappedBy="createdBy")
  private Set<Event> createdEvents;

  @OneToMany(mappedBy = "user")
  private Set<EventParticipants> events;

  @ManyToOne()
  @JoinColumn(name="mother_id")
  private User mother;

  @ManyToOne()
  @JoinColumn(name="father_id")
  private User father;

  @ManyToOne
  @JoinColumn(name="tutor_id")
  private User tutor;

  @ManyToOne()
  @JoinColumn(name="created_by")
  private User createdBy;

  @ManyToOne()
  @JoinColumn(name="emergency_id")
  private Emergency emergency;

  // TODO add emergency foreign key
  // TODO add residence town and domicile town foreign keys



  public User() {
    this.uuid = UUID.randomUUID().toString();
  }

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getCf() {
    return cf;
  }

  public void setCf(String cf) {
    this.cf = cf;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Date getBirthdayDate() {
    return birthdayDate;
  }

  public void setBirthdayDate(Date birthdayDate) {
    this.birthdayDate = birthdayDate;
  }

  public String getResidenceAddress() {
    return residenceAddress;
  }

  public void setResidenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
  }

  public String getDomicileAddress() {
    return domicileAddress;
  }

  public void setDomicileAddress(String domicileAddress) {
    this.domicileAddress = domicileAddress;
  }

  public Timestamp getPwdUpdatedAt() {
    return pwdUpdatedAt;
  }

  public void setPwdUpdatedAt(Timestamp pwdUpdatedAt) {
    this.pwdUpdatedAt = pwdUpdatedAt;
  }

  public Set<Space> getCreatedSpaces() {
    return createdSpaces;
  }

  public void setCreatedSpaces(Set<Space> createdSpaces) {
    this.createdSpaces = createdSpaces;
  }

  public Set<Event> getCreatedEvents() {
    return createdEvents;
  }

  public void setCreatedEvents(Set<Event> createdEvents) {
    this.createdEvents = createdEvents;
  }

  public Set<EventParticipants> getEvents() {
    return events;
  }

  public void setEvents(Set<EventParticipants> events) {
    this.events = events;
  }

  public User getMother() {
    return mother;
  }

  public void setMother(User mother) {
    this.mother = mother;
  }

  public User getFather() {
    return father;
  }

  public void setFather(User father) {
    this.father = father;
  }

  public User getTutor() {
    return tutor;
  }

  public void setTutor(User tutor) {
    this.tutor = tutor;
  }

  public User getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  public Emergency getEmergency() {
    return emergency;
  }

  public void setEmergency(Emergency emergency) {
    this.emergency = emergency;
  }
}
