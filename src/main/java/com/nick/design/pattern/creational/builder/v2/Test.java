package com.nick.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course  course = new Course.CourseBuilder()
                    .buildCourseName("java设计模式")
                .buildCourseArticle("java设计模式手记")
                .buildCoursePPT("java设计模式ppt")
                .buildCourseVideo("java设计模式video")
                .buildCourseQA("java设计模式qa")
                .build();
        System.out.println(course);
    }
}
