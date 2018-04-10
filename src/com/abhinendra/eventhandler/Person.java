package com.abhinendra.eventhandler;


public class Person {
    private String name;
    private int age;

    public Event<PropertyChangedEventArgs>  propertyChangedEvent=new Event<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChangedEvent.fire(new PropertyChangedEventArgs(this,"age"));
    }
}
