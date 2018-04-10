package com.abhinendra.fluencyBuilder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    public SELF withName(String name){
        person.setName("Abhinendra");
        return (SELF)this;
    }

    public Person build() {
        return person;
    }
}
