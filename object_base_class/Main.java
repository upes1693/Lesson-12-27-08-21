package com.object_base_class;

public class Main {
    public static void main(String[] args){
        Object person=new Person(1,"Mark");
       // System.out.println(person);
        String s=person.toString();
        System.out.println(s);

        Person p1=new Person(1,"Mark");
        Person p2=new Person(1,"Mark");
        Person p3=p1;
        boolean b=p1.equals(p2);
        System.out.println(b);

        Class c=person.getClass();
        System.out.println(c);
    }
}
