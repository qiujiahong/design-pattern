## 单一职能原则


### 概念

不要存在多余一个倒置类变更的原因，一个类、接口、方法只负责一个职责。


###  优缺点

降低类的复杂度，提高可读性，提高系统的可维护性，降低变更引起的风险。



### 举例

* 如下图，鸟被拆分成为飞鸟，和行走的鸟；

![](./assets/2018-11-11-17-07-45.png)

* 如下图一个接口只实现一个职责，一个具体的实现类，可以同时集成多个接口，实现具体的职能。

![](./assets/2018-11-11-17-16-00.png)


* 方法的单一职责

```java
package com.nick.design.principle.singleresponsibility;

public class Method {
    /****************************************************************************/
    private void updateUserInfo(String name,String address){
        name="nick";
        address = "南山";
    }
    private void updateuserinfo(String name,String... properties){
        name = "nick";
    }
    /**
     * 把 void updateUserInfo(String name,String address) 拆解成为2个单一的方法，2个方法有自己的职责
     * @param name
     */
    private void upadateUsername(String name){
        name="nick";
    }
    private void updateUserAddress(String address){
        address = "南山";
    }
    /****************************************************************************/
    private void updateUserInfo(String name,String address,boolean bool){
        if(bool){
            //do something 1
        }else {
            //do something 2
        }
    }
    /**
     *  把前面一个方法拆解成为2个方法一个执行true的代码，一个执行false的代码
     * @param name
     * @param address
     */
    private void updateUserInfoBoolTrue(String name,String address){

    }

    private void updateUserInfoBoolFalse(String name,String address){

    }


}

```