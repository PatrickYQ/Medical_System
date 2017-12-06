package com_entity;


import java.sql.Date;

public class HeTong {

  private int id;
  private String type;
  private int xieyi_Hao;
  private String hetong_Neirong;
  private String caigou_Shebei;
  private java.sql.Date date;
  private int money;
  private String bei_Zhu;
  private java.sql.Date shehe_Date;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getXieyi_Hao() {
    return xieyi_Hao;
  }

  public void setXieyi_Hao(int xieyi_Hao) {
    this.xieyi_Hao = xieyi_Hao;
  }

  public String getHetong_Neirong() {
    return hetong_Neirong;
  }

  public void setHetong_Neirong(String hetong_Neirong) {
    this.hetong_Neirong = hetong_Neirong;
  }

  public String getCaigou_Shebei() {
    return caigou_Shebei;
  }

  public void setCaigou_Shebei(String caigou_Shebei) {
    this.caigou_Shebei = caigou_Shebei;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public String getBei_Zhu() {
    return bei_Zhu;
  }

  public void setBei_Zhu(String bei_Zhu) {
    this.bei_Zhu = bei_Zhu;
  }

  public Date getShehe_Date() {
    return shehe_Date;
  }

  public void setShehe_Date(Date shehe_Date) {
    this.shehe_Date = shehe_Date;
  }
}
