package com.nick.design.principle.openclose;

import lombok.Data;
import lombok.Getter;

@Getter
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
