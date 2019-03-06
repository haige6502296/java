package com.lct;

import javax.persistence.*;

@NamedQueries({@NamedQuery(name = "findEmployeeByLastName",query = "from Employee e where e.lastName=:byLastName")})



@Entity
@Table(name = "em500")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)//自动增加id
  private int id;
  private String firstName,lastName;

  @Override
  public String toString() {
    return "Employee<id='" + id + "', firstName='" + firstName + "', lastName='" + lastName  +"'>";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
