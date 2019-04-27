package com.nick.design.pattern.behavioral.interator;

public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}
