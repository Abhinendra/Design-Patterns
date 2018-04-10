package com.abhinendra.observer;

public interface Observer<T> {
    public void handle(PropertyChangedEventArgs<T> args);
}
