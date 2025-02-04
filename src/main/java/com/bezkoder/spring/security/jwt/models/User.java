package com.bezkoder.spring.security.jwt.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

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
public class User extends AbstractModel{
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

  @Column()
  private String phone_number;

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

  // TODO add foreign keys



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
}
