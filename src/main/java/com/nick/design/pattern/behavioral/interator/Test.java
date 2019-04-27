package com.nick.design.pattern.behavioral.interator;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("java 1期");
        Course course2 = new Course("java 2期");
        Course course3 = new Course("java 3期");
        Course course4 = new Course("java 4期");
        Course course5 = new Course("java 5期");
        Course course6 = new Course("java 6期");


        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("----课程列表----");
        printCourses(courseAggregate);
        courseAggregate.removeCourse(course5);
        courseAggregate.removeCourse(course4);
        System.out.println("----删除之后课程列表----");
        printCourses(courseAggregate);
    }

    private static void printCourses(CourseAggregate courseAggregate) {

        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }

}
