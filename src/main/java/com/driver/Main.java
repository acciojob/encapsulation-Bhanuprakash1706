package com.driver;

public class Main {
  public static void main(String [] args){
      RWOnly obj=new RWOnly();
      //obj.name="Bhanu";
      //java: name has private access in com.driver.RWOnly
      obj.setName("Bhanu Prakash Reddy");
      System.out.println(obj.getName());
  }
}