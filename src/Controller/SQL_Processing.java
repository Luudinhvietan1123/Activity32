package Controller;

import Model.Laptop_Products;

import java.util.ArrayList;

public class SQL_Processing {

    /*//SEACHING
    public String SEARCH_Product_Price_from(int priceFrom){
        return "SELECT price FROM store_cms_plusplus.laptop WHERE price > '" + priceFrom + "';";
    }
    public String SEARCH_Product_Price_to(int priceTo){
        return "SELECT price FROM store_cms_plusplus.laptop WHERE price < '" + priceTo + "';";
    }
    public String SEARCH_Product_Maker(String maker){
        return "SELECT maker FROM store_cms_plusplus.laptop WHERE maker = '" + maker + "';";
    }
    public String SEARCH_Product_ScreenSize(String ScreenSize){
        return "SELECT screen_size FROM store_cms_plusplus.laptop WHERE screen_size = '" + ScreenSize + "';";
    }
    public String SEARCH_Product_Ram(String Ram){
        return "SELECT ram FROM store_cms_plusplus.laptop WHERE ram = '" + Ram + "';";
    }
    public String SEARCH_Product_CPU(String CPU){
        return "SELECT cpu FROM store_cms_plusplus.laptop WHERE cpu = '" + CPU + "';";
    }
    public String SEARCH_Product_Type(String Type){
        return  "SELECT ssd, hdd FROM store_cms_plusplus.laptop WHERE " + Type + " IS NOT NULL;";
    }
    public String SEARCH_Product_Card(String Card){
        return "SELECT card FROM store_cms_plusplus.laptop WHERE card = '" + Card + "';";
    }*/

    //SORTING(ASC/DESC)
    public String SORTING_Product_by(String from, String productPropety, String orderType){
        return "SELECT " + productPropety + " FROM " + from + " ORDER BY + " + productPropety + " " + orderType + ";";
    }


    public String getPriceQuery(long x, long y){
        if(x == -1 && y == -1){
            return "SELECT * FROM store_cms_plusplus.laptop WHERE 1 = 1";
        }
        else{
            if(x == -1){
                return "SELECT * FROM store_cms_plusplus.laptop WHERE price <= " + y;
            }
            if(y == -1){
                return "SELECT * FROM store_cms_plusplus.laptop WHERE price >= " + x;
            }
            return "SELECT * FROM store_cms_plusplus.laptop WHERE price BETWEEN " + x + " AND " + y;
        }
    }

    public String getProductWithMultipleCriteria(long priceFrom, long priceTo, String maker, float screenSize, String ram, String cpu, String type, String orderCriteria, String order, String card){
        String query = getPriceQuery(priceFrom, priceTo);
        if (!maker.isEmpty()) {
            query += " AND maker = '" + maker.toUpperCase() + "'";
        }
        if (screenSize!=-1) {
            query += " AND screen_size = " + screenSize;
        }
        if (!ram.isEmpty()) {
            query += " AND ram = '" + ram.replace(" ", "").toUpperCase() + "'";
        }
        if (!cpu.isEmpty()) {
            query += " AND UPPER(cpu) LIKE UPPER('%"+cpu+"%')";
        }
        if (!type.isEmpty()) {
            query += " AND UPPER(type) LIKE UPPER('%"+type+"%')";
        }
        if (!card.isEmpty()) {
            query += " AND UPPER(card) LIKE UPPER('%"+card+"%')";
        }
        if (!orderCriteria.isEmpty()) {
            query += " ORDER BY " + orderCriteria.toLowerCase();
        }
        switch (order) {
            case "ascending":
                query += " ASC";
                break;
            default:
                query += " DESC";
                break;
        }
        return query;
    }
}
