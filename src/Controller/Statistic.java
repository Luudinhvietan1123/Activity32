package Controller;

import java.sql.*;
import java.util.List;

public class Statistic {
    private String maker;
    private int sold;
    private int total;

    private Statistic(String maker, int sold, int total){
        this.maker = maker;
        this.sold = sold;
        this.total = total;
    }

    private List<Statistic> statistic;

    private List<Statistic> setListStatistic(ResultSet resultSet) throws SQLException{
        while (resultSet.next()){
            Statistic thisStatistic = new Statistic(
                    resultSet.getString(1),
                    resultSet.getInt(2),
                    resultSet.getInt(3)
            );
            statistic.add(thisStatistic);
        }
        return statistic;
    }

    public List<Statistic> getStatisticByMaker(){
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
            String sql = "SELECT maker, SUM(sold), SUM(price*sold) AS Total FROM store_cms_plusplus.laptop GROUP BY maker ORDER BY Total DESC";
            ResultSet resultSet = statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return statistic;
    }
}
