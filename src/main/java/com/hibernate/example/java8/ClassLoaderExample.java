package com.hibernate.example.java8;

public class ClassLoaderExample {
    void fis(){
        System.out.println("ClassLoader for String: " + this.getClass());
    }

    public static void main(String[] args) {
new ClassLoaderExample().fis();


    }
}