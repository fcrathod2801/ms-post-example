package com.hibernate.example.marker.example;

class Test implements Cloneable{
   private int id;
   private String name;
   Test(int id,String name){
       super();
       this.id=id;
       this.name=name;

   }
  public String toString(){
       return "ID"+id+" Name:"+name;
   }

   void dis(){
       System.out.println("ID "+id +" Name:"+name);
   }

public static void main(String ae[]) throws CloneNotSupportedException{
    Test o=new Test(1,"Avinash");
    Test ob=(Test)o.clone();
    ob.dis();
    System.out.println(o+" -- "+ob);
}
}
