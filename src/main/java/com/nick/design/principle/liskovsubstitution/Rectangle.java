package com.nick.design.principle.liskovsubstitution;


import lombok.Data;

public class Rectangle implements  Quadrangle{
    private long length;
    private long width ;

    public long getWidth() {
        return this.width;
    }

    public long getLength() {
        return this.length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
