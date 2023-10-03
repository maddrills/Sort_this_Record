package dev.lpa;

import java.util.Arrays;

public record Person(int age, String name, Person[] children) implements Comparable<Person>{
    public Person{
        if(!(children == null)){
            children = Arrays.copyOf(children,children.length);
        }
    }
    public Person(int age,String name){
        this(age,name,null);
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
