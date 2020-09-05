package Controller;

import java.sql.*;
import static Controller.Product_List.setLaptop_List;

public class Get_Product_Data {
    public void getLaptopData(String SQLrequest){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            return;
        }
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8", "root", "123123");
        }catch (SQLException e){
            return;
        }
        try {
            Statement statement = connection.createStatement();
            String sql = SQLrequest;
            ResultSet resultSet = statement.executeQuery(sql);
            setLaptop_List(resultSet);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void getPhoneData(String SQLrequest){
    }
}
