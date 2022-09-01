package com.training.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
//@Table(name = "EMPLOYEE")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "employee")
public class Employee {

  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @NotNull
  @Size(min=4, message="Name should have atleast 4 characters")
  //@Column(name = "name")
  String name;
  Double salary;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }
}