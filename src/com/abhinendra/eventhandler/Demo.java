package com.abhinendra.eventhandler;

public class Demo {
    public static void main(String[] args) throws Exception {
        Person person=new Person("Abhinendra",23);
        Event<PropertyChangedEventArgs>.Subscription subscription = person.propertyChangedEvent.addHandler(x -> {
            System.out.println("Person's property " + x.propertyName + " has changed");
        });
        
        person.setAge(24);
        person.setAge(32);
        subscription.close();
        person.setAge(25);

    }
}
