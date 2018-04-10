package com.abhinendra.facetedBuilder;

public class Demo {

    public static void main(String[] args){
        PersonBuilder personBuilder=new PersonBuilder();
        Person person=personBuilder
                .lives()
                .in("Pune")
                .at("Gulmohar Orchids")
                .withPostCode("40010")
                .works()
                .position("Assistant Manager")
                .worksAt("CITI")
                .annualIncome(1600000)
                .build();

        System.out.println(person);
    }


}
