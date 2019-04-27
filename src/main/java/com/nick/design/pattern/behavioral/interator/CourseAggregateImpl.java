package com.nick.design.pattern.behavioral.interator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;
    public  CourseAggregateImpl(){
        courseList = new ArrayList();
    }
    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
