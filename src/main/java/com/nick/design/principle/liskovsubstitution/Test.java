package com.nick.design.principle.liskovsubstitution;

public class Test {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        }
        System.out.println("resize 方法结束 witdh :"+rectangle.getWidth());
    }
    public static void main(String[] args) {
        //1
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
        //2 代码段1 的表现和2的表现不一样
//        Square square = new Square();
//        square.setSideLength(10);
//        resize(square);
    }
}
