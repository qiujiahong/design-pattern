package com.nick.design.pattern.behavioral.interator;

import java.util.ArrayList;
import java.util.List;

public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position ;
    private Course course;

    public CourseIteratorImpl(List courseList){
        this.courseList = courseList;
    }
    public Course nextCourse() {
        System.out.println("返回课程的位置是: "+ position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }
    public boolean isLastCourse() {
        return (position < courseList.size())? false:true;
    }
}
