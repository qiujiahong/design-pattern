package com.nick.design.principle.liskovsubstitution;

import lombok.Data;

public class Square  implements Quadrangle{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getWidth() {
        return getSideLength();
    }

    public long getLength() {
        return getSideLength();
    }
}
