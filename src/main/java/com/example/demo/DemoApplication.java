package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {
//    private static void testSqlite() {
//        try {
//            String sql="jdbc:sqlite:/Users/litianjie/test.db";
//
//            Class.forName("org.sqlite.JDBC");
//            Connection conn = DriverManager.getConnection(sql);
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery("select * from COMPANY");
//            while (rs.next()) { // 将查询到的数据打印出来
//                System.out.print(rs.getString("ID"));
//            }
//            System.out.println(1111111);
//            rs.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
