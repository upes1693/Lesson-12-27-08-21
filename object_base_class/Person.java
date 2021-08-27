package com.object_base_class;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;

        return (p.id == this.id && p.name == this.name);
    }

    @Override
    public int hashCode(){
        return id;
    }


}
