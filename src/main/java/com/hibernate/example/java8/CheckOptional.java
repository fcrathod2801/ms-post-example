package com.hibernate.example.java8;

import java.util.Locale;
import java.util.Optional;

public class CheckOptional {
    public static void main(String ar[]){
        String name="avinash";
        Optional<String> checkNull=Optional.ofNullable(name);

        if(checkNull.isPresent()){
            name=name.toUpperCase();
        }else {
            System.out.println("Null value is there ");
        }
        System.out.println(name);
    }
}
