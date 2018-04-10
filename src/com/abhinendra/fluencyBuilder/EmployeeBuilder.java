package com.abhinendra.fluencyBuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
     public EmployeeBuilder worksAt(String position){
         person.setPosition(position);
         return  this;
     }
}
