package Controller;

import Model.Laptop_Products;
import Model.Phone_Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product_List {
    private static ArrayList<Laptop_Products> Laptop_List;
    private static ArrayList<Phone_Product>  Phone_List;

    public static void setLaptop_List(ResultSet resultSet){
        try{
            while (resultSet.next()){
                Laptop_Products thisLaptop = new Laptop_Products(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        resultSet.getFloat(13),
                        resultSet.getInt(14),
                        resultSet.getString(15),
                        resultSet.getString(16)
                );
                Laptop_List.add(thisLaptop);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
