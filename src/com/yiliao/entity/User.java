package com.yiliao.entity;


import java.sql.Date;

public class User {

  private int userId;
  private String username;
  private String password;
  private String realName;
  private String email;
  private String department;
  private String characters;
  private Object creatTime;
  private int access;
  private String state;


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
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

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCharacters() {
    return characters;
  }

  public void setCharacters(String characters) {
    this.characters = characters;
  }

  public Object getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(Object creatTime) {
    this.creatTime = creatTime;
  }

  public int getAccess() {
    return access;
  }

  public void setAccess(int access) {
    this.access = access;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
