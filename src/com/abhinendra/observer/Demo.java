package com.abhinendra.observer;

public class Demo implements Observer<Person>{
    public  Demo(){
        Person person=new Person("Abhinendra",23);
        Observable<Person> observable=new Observable<>();
        person.subscribe(this);
        for(int age=24;age<29;age++){
        person.setAge(age);
        }
    }

    public static void main(String[] args){
         Demo demo=new Demo();
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println(args.source +" property "+args.propertyName+" changed to "+args.newValue);
    }
}
