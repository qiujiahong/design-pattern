package com.nick.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
//        v1
//        Nick nick = new Nick();
//        nick.studyJavaCourse();
//        nick.studyFECourse();

//        v2
//        Nick nick = new Nick();
//        nick.studyCourse(new JavaCourse());
//        nick.studyCourse(new FECourse());
//        v3
//        Nick nick =  new Nick(new JavaCourse());
//        nick.studyCourse();

        Nick nick = new Nick();
        nick.setiCourse(new JavaCourse());
        nick.studyCourse();

        nick.setiCourse(new FECourse());
        nick.studyCourse();
    }
}
