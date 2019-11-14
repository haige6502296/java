/*
Usage:Static
Author:Amaru
Time:2019-11-14 23:34:17
Detail:Program of the counter without static variable
*/
/*In this example, we have created an instance variable named count which is incremented in the constructor. Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable. If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.*/
package com.lct;

public class StaticTest {
  private int count = 0;

  private StaticTest() {
    count++;
    System.out.println(count);
  }

  public static void main(String[] args) {
StaticTest s1=new StaticTest();
StaticTest s2=new StaticTest();
StaticTest s3=new StaticTest();
  }
}
