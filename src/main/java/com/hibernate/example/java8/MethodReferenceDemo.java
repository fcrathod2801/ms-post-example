package com.hibernate.example.java8;
interface  AA{
    void display();
}

class AB{

    AB(){
        System.out.println("Constructor RFeference of FI");
    }
    public void dis(){
        System.out.println("Method Reference of FUnctional Interface");
    }
    static void getDisplay(){
        System.out.println("Static Reference of FI");
    }
}

public class MethodReferenceDemo {
    public static void main(String ar[]){

        AA ob=new AB()::dis;
        ob.display(); //Instance Reference of FI

        AA obj=AB::new;
        obj.display(); //constructor Reference of FI
        AA onj1=AB::getDisplay;
        onj1.display(); //static reference of FI

    }
}
