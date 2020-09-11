package Controller;

import java.sql.*;

public class UpdateQuanitySold {
    public boolean upateQuanitySold(int ID, int quanity){
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
            String sql1 = "SELECT sold FROM store_cms_plusplus.laptop WHERE id = " + ID + ";";
            ResultSet resultSet = statement.executeQuery(sql1);
            int sold = resultSet.getInt(14) + quanity;
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sql2 = "UPDATE store_cms_plusplus.laptop SET sold = " + sold + " SET last_updated_timestamp = " + timestamp + " WHERE id = " + ID;
            statement.executeQuery(sql2);
            return true;
        }catch (SQLException e){
            return false;
        }
    }
}
