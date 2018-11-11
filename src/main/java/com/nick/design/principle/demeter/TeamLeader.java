package com.nick.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courses = new ArrayList<Course>();
        for (int i=0;i<20;i++){
            courses.add(new Course());
        }
        System.out.println("课程数量是:"+courses.size());
    }
}
