package com.ttn.cafe;

public class Biscuits {
    String name;

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    @Override
    public String toString ( ) {
        return "Biscuits{" +
                "name='" + name + '\'' +
                '}';
    }
}
