package com.hibernate.example.java8;

import java.util.Optional;

public class Test {
    public static void main(String... args){
        String name="Avinash";
        String name1=null;

        Optional<String> option=Optional.ofNullable(name);
        Optional<String> options=Optional.of(name1);
        if(options.isPresent()){
            System.out.println("options : "+options.get());
        }else{
            System.out.println("options::"+options.get());
        }

    }
}
