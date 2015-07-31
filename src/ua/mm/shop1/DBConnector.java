package ua.mm.shop1;

import java.sql.*;

public class DBConnector {
    public static void connection(String s[]){
        try{
            String dbUrl = "jdbc:postgresql://10.0.1.139/shop1";
          //  Class.forName("com.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            System.out.println("Connection to DB...");
            Connection conn = DriverManager.getConnection(dbUrl, "admin", "admin");
            Statement stmt = conn.createStatement();

            String sqlQueryCreate = "CREATE TABLE IF NOT EXISTS " + "orders " + " (" +
                    "id SERIAL, " +
                    "itemId VARCHAR , title VARCHAR , authorName VARCHAR , "+
                    "releaseYear VARCHAR , orderDate VARCHAR , customerName VARCHAR , "+
                    "customerPhone VARCHAR, PRIMARY KEY (\"id\"))";
            String sqlQueryInsert = "INSERT INTO orders (itemId, title, authorName, releaseYear, orderDate, " +
                    "customerName, customerPhone) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatementCreate = conn.prepareStatement(sqlQueryCreate); //create Table if not exists
            preparedStatementCreate.execute();

            PreparedStatement preparedStatementInsert = conn.prepareStatement(sqlQueryInsert);
            preparedStatementInsert.setString(1, s[0]);
            preparedStatementInsert.setString(2, s[1]);
            preparedStatementInsert.setString(3, s[2]);
            preparedStatementInsert.setString (4, s[3]);
            preparedStatementInsert.setString (5, s[4]);
            preparedStatementInsert.setString (6, s[5]);
            preparedStatementInsert.setString (7, s[6]);
            preparedStatementInsert.execute();
            conn.close();
            System.out.println("Inserted");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
