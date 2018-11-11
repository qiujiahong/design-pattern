package com.nick.design.principle.dependenceinversion;

public class Nick {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
//  V3
//    public Nick(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }



    public void studyCourse() {
        iCourse.studyCourse();
    }

    //v2
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }

    //V1
    //    public void studyJavaCourse(){
    //        System.out.println("Nick is studying java course ");
    //    }
    //    public void studyFECourse(){
    //        System.out.println("Nick is studying FE course ");
    //    }

}
