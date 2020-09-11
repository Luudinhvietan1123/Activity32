package Controller;

import Model.Laptop_Products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public boolean insertData(String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd,
                           int price, String card, String screenResolution, float size, int sold){
        try{
            Class.forName("com.mysql,cj,jdbc,Driver");
        }catch (ClassNotFoundException e){
            return false;
        }
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8", "root", "123123");
        }catch (SQLException e){
        }
        try {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO store_cms_plusplus.laptop (name, url, maker, type, ram, cpu, ssd, hdd, price, card, screen_resolution, screen_size, sold)" +
                    "VALUES(" + name + "," + url + "," + maker + "," + type + "," + ram + "," + cpu + "," + ssd + "," + hdd + "," + price + "," + card + "," + screenResolution + "," + size + "," + sold + ")";
            statement.executeQuery(sql);
            return true;
        }catch (SQLException e){
            return false;
        }
    }
}
