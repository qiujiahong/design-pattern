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
