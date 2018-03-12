package com.ttn.cafe;

public class Cake {
    String name;

    @Override
    public String toString ( ) {
        return "Cake{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
