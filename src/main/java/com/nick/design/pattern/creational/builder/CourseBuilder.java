package com.nick.design.pattern.creational.builder;

public abstract class CourseBuilder {
    //    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//
//    private String courseQA;
    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
