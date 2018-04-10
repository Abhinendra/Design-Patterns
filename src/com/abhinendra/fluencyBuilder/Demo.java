package com.abhinendra.fluencyBuilder;

public class Demo {
    public static void main(String[] args){
        EmployeeBuilder employeeBuilder=new EmployeeBuilder();
        Person person=employeeBuilder.withName("Abhinendra").worksAt("Citi").build();
        System.out.println(person);
    }
}
