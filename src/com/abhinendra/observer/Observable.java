package com.abhinendra.observer;

import java.util.ArrayList;
import java.util.List;
import com.abhinendra.observer.Observer;

public class Observable<T> {
      private List<Observer> observerList=new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        this.observerList.add(observer);
    }

    protected void propertyChanged(T soucre, String propertyName,Object newValue) {
        for(Observer<T> observer:observerList){
            observer.handle(new PropertyChangedEventArgs<T>(soucre,propertyName,newValue));
        }
    }

    
}
