package com.ttn.cafe;

public class Combo {
    public Cake cake;
    public Biscuits biscuits;

    public Cake getCake ( ) {
        return cake;
    }

    public void setCake ( Cake cake ) {
        this.cake = cake;
    }

    public Biscuits getBiscuits ( ) {
        return biscuits;
    }

    public void setBiscuits ( Biscuits biscuits ) {
        this.biscuits = biscuits;
    }

    @Override
    public String toString ( ) {
        return "Combo{" +
                "cake=" + cake +
                ", biscuits=" + biscuits +
                '}';
    }
    @Deprecated
    public void exception() {
        throw new IllegalArgumentException ();
    }
}
