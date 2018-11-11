package com.nick.design.principle.singleresponsibility;

public class Bird {
    public void mainMoveMode(String birdName) {
        if (birdName.equals("鸵鸟"))
            System.out.println(birdName + "用脚走");
        else
            System.out.println(birdName + "用翅膀飞");
    }
}
