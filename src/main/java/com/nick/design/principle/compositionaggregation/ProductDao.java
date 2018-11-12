package com.nick.design.principle.compositionaggregation;

public class ProductDao  {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String con = dbConnection.getConnection();
        System.out.println("使用链接:"+con+"增加产品");
    }
}
