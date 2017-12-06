package com_entity;


import java.sql.Date;

public class KuCun {

  private int id;
  private String name;
  private int count;
  private String guige;
  private String type;
  private int price;
  private java.sql.Date time;
  private int ruku_Num;
  private String form;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String getGuige() {
    return guige;
  }

  public void setGuige(String guige) {
    this.guige = guige;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public int getRuku_Num() {
    return ruku_Num;
  }

  public void setRuku_Num(int ruku_Num) {
    this.ruku_Num = ruku_Num;
  }

  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }
}
