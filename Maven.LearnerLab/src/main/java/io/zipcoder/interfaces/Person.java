package io.zipcoder.interfaces;

public class Person {
    private final long id = 0;

    private String name;

    public Person(long id, String name){
        id = this.id;
        name = this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

}
