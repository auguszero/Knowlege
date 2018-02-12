package com.auguszero.C3P0Builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author haisong
 * @create 2018/02/11 13:37
 */
public class Connect {


    public static void main(String[] args){
        try {
            //注册驱动
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //创建链接
            Connection connection = DriverManager.getConnection("url","usr","pasword");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
