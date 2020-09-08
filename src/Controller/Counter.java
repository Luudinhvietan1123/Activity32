package Controller;

import java.sql.*;
import java.util.List;

public class Counter {
    private String maker;
    private int quantity;

    private Counter(String maker, int quantity){
        this.maker = maker;
        this.quantity = quantity;
    }

    private List<Counter> counters;

    private List<Counter> setListCounter(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            Counter thisMaker = new Counter(
                    resultSet.getString(1),
                    resultSet.getInt(2)
            );
            counters.add(thisMaker);
        }
        return counters;
    }

    public List<Counter> getCounterByMaker(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
        }
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8", "root", "123123");
        }catch (SQLException e){
        }
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT maker, COUNT(1) AS NumberOfProduct FROM store_cms_plusplus.laptop GROUP BY maker ORDER BY NumberOfProduct ASC";
            ResultSet resultSet = statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return counters;
    }

}
