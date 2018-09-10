package com.nick.design.principle.openclose;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "设计模式", 2345d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println(String.format("课程id=%d的，课程名称=%s，课程原价:%f，折后价格:%f元",
                javaCourse.getId(), javaCourse.getName(),javaCourse.getOriginPrice(), javaCourse.getPrice()));
    }
}
