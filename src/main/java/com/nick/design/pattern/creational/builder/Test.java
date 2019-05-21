package com.nick.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式",
                    "java设计模式ppt",
                                "Java设计模式视频",
                        "Java设计模式手记",
                "Java设计模式QA");
        System.out.println(course);
    }
}

