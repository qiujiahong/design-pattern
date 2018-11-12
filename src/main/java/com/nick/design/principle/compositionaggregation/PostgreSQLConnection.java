package com.nick.design.principle.compositionaggregation;

public class PostgreSQLConnection extends DBConnection {
    public String getConnection() {
        return "Postgre数据库链接";
    }
}
