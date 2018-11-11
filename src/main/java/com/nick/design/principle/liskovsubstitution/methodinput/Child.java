package com.nick.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    //重写
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap被执行");
////        super.method(map);
//    }

    //重载  子类的需要更宽松'
    public void method(Map map) {
        System.out.println("子类map被执行");
//        super.method(map);
    }
}
