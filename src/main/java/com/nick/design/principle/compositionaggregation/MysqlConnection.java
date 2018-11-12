package com.nick.design.principle.compositionaggregation;

public class MysqlConnection extends DBConnection {
    public String getConnection() {
        return "Mysql数据库链接";
    }
}
