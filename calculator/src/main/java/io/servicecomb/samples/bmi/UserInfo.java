package io.servicecomb.samples.bmi;

import java.io.Serializable;

public class UserInfo implements Serializable{
  private static final long serialVersionUID =1L;

  private String account;
  private int age;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "UserInfo{" +
        "account='" + account + '\'' +
        ", age=" + age +
        '}';
  }
}
