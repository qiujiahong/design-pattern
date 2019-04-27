package com.nick.design.pattern.behavioral.interator;

public interface CourseIterator {
    Course nextCourse();    //获取下一个课程
    boolean isLastCourse(); //判断该课程是否是最后一个
}
